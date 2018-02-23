package com.example.demo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * Qstudent is a Querydsl query type for student
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class Qstudent extends EntityPathBase<student> {

    private static final long serialVersionUID = -1605600895L;

    public static final Qstudent student = new Qstudent("student");

    public final StringPath id = createString("id");

    public final NumberPath<Float> marks = createNumber("marks", Float.class);

    public final StringPath name = createString("name");

    public final StringPath teamName = createString("teamName");

    public Qstudent(String variable) {
        super(student.class, forVariable(variable));
    }

    public Qstudent(Path<? extends student> path) {
        super(path.getType(), path.getMetadata());
    }

    public Qstudent(PathMetadata metadata) {
        super(student.class, metadata);
    }

}

