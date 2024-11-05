package com.example.jpa.domain.common;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 1699476456L;

    public static final QUser user = new QUser("user");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath address = createString("address");

    public final DatePath<java.time.LocalDate> birth = createDate("birth", java.time.LocalDate.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath email = createString("email");

    public final EnumPath<com.example.jpa.domain.enums.Gender> gender = createEnum("gender", com.example.jpa.domain.enums.Gender.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DatePath<java.time.LocalDate> inactiveDate = createDate("inactiveDate", java.time.LocalDate.class);

    public final ListPath<Inqury, QInqury> inquryList = this.<Inqury, QInqury>createList("inquryList", Inqury.class, QInqury.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final ListPath<Notice, QNotice> noticeList = this.<Notice, QNotice>createList("noticeList", Notice.class, QNotice.class, PathInits.DIRECT2);

    public final StringPath phone = createString("phone");

    public final NumberPath<Integer> point = createNumber("point", Integer.class);

    public final ListPath<Review, QReview> reviewList = this.<Review, QReview>createList("reviewList", Review.class, QReview.class, PathInits.DIRECT2);

    public final EnumPath<com.example.jpa.domain.enums.UserStatus> status = createEnum("status", com.example.jpa.domain.enums.UserStatus.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final ListPath<com.example.jpa.domain.mapping.UserCategory, com.example.jpa.domain.mapping.QUserCategory> userCategoryList = this.<com.example.jpa.domain.mapping.UserCategory, com.example.jpa.domain.mapping.QUserCategory>createList("userCategoryList", com.example.jpa.domain.mapping.UserCategory.class, com.example.jpa.domain.mapping.QUserCategory.class, PathInits.DIRECT2);

    public final ListPath<com.example.jpa.domain.mapping.UserMission, com.example.jpa.domain.mapping.QUserMission> userMissionArrayList = this.<com.example.jpa.domain.mapping.UserMission, com.example.jpa.domain.mapping.QUserMission>createList("userMissionArrayList", com.example.jpa.domain.mapping.UserMission.class, com.example.jpa.domain.mapping.QUserMission.class, PathInits.DIRECT2);

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

