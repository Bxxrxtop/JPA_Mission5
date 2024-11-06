package com.example.jpa.repository.mission;

import com.example.jpa.domain.common.Mission;
import com.example.jpa.domain.common.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.lang.reflect.Member;

public interface MissionRepositoryCustom {
    Page<Mission> dynamicQueryWithBooleanBuilder(User user, Pageable pageable);

    Page<Mission> getAvailableMissionsInArea(User user, Pageable pageable);
}
