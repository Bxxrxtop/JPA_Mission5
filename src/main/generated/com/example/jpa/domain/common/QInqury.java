package com.example.jpa.domain.common;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInqury is a Querydsl query type for Inqury
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInqury extends EntityPathBase<Inqury> {

    private static final long serialVersionUID = 761498349L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInqury inqury = new QInqury("inqury");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath picture = createString("picture");

    public final StringPath title = createString("title");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final QUser user;

    public QInqury(String variable) {
        this(Inqury.class, forVariable(variable), INITS);
    }

    public QInqury(Path<? extends Inqury> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInqury(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInqury(PathMetadata metadata, PathInits inits) {
        this(Inqury.class, metadata, inits);
    }

    public QInqury(Class<? extends Inqury> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

