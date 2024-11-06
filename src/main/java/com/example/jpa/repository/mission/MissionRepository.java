package com.example.jpa.repository.mission;

import com.example.jpa.domain.common.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<Mission, Long>, MissionRepositoryCustom{
}
