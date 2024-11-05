package com.example.jpa.domain.common;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMission is a Querydsl query type for Mission
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMission extends EntityPathBase<Mission> {

    private static final long serialVersionUID = 1245292623L;

    public static final QMission mission = new QMission("mission");

    public final StringPath content = createString("content");

    public final DatePath<java.time.LocalDate> deadline = createDate("deadline", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final ListPath<com.example.jpa.domain.mapping.UserMission, com.example.jpa.domain.mapping.QUserMission> userMissionList = this.<com.example.jpa.domain.mapping.UserMission, com.example.jpa.domain.mapping.QUserMission>createList("userMissionList", com.example.jpa.domain.mapping.UserMission.class, com.example.jpa.domain.mapping.QUserMission.class, PathInits.DIRECT2);

    public QMission(String variable) {
        super(Mission.class, forVariable(variable));
    }

    public QMission(Path<? extends Mission> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMission(PathMetadata metadata) {
        super(Mission.class, metadata);
    }

}

