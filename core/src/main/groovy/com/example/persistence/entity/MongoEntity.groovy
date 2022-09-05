package com.example.persistence.entity

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import org.bson.types.ObjectId

abstract class MongoEntity extends AuditableEntity {

    @Id
    @GeneratedValue
    ObjectId id

}
