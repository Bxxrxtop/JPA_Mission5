package com.example.jpa.repository.user;

import com.example.jpa.domain.common.QUser;
import com.example.jpa.domain.common.User;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryCustom {
    private final JPAQueryFactory queryFactory;
    private final QUser user = QUser.user;
    public User getProfile(Long userId){
        return queryFactory.selectFrom(user)
                .where(user.id.eq(userId))
                .fetchOne();
    }
}
