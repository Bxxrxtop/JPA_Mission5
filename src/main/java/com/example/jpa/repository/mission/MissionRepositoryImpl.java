package com.example.jpa.repository.mission;

import com.example.jpa.domain.common.*;
import com.example.jpa.domain.mapping.QUserMission;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MissionRepositoryImpl implements MissionRepositoryCustom {
    private final JPAQueryFactory queryFactory;
    private final QMission mission = QMission.mission;
    private final QUserMission userMission = QUserMission.userMission;
    private final QUser user = QUser.user;
    private final QRestaurant restaurant = QRestaurant.restaurant;

    @Override
    public Page<Mission> dynamicQueryWithBooleanBuilder(User user, Pageable pageable) {
        // 미션 목록 조회
        List<Mission> missions = queryFactory
                .selectFrom(mission)
                .join(mission.userMissionList, userMission)
                .where(userMission.user.eq(user))
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        // 전체 미션 개수 조회
        long total = queryFactory
                .selectFrom(mission)
                .join(mission.userMissionList, userMission)
                .where(userMission.user.eq(user))
                .fetchCount();

        return new PageImpl<>(missions, pageable, total);
    }
    @Override
    public Page<Mission> getAvailableMissionsInArea(User user, Pageable pageable) {
        // 미션 목록 조회
        List<Mission> missions = queryFactory
                .selectFrom(mission)
                .join(mission.restaurant, restaurant) // Restaurant과 조인
                .where(restaurant.address.eq(user.getAddress())) // 주소 비교
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        // 전체 미션 개수 조회
        long total = queryFactory
                .selectFrom(mission)
                .join(mission.restaurant, restaurant)
                .where(restaurant.address.eq(user.getAddress()))
                .fetchCount();

        return new PageImpl<>(missions, pageable, total);
    }
}
