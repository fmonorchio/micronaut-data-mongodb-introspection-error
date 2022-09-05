package com.example.core.persistence.entity

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import org.bson.types.ObjectId

@Introspected
abstract class MongoEntity extends AuditableEntity {

    @Id
    @GeneratedValue
    ObjectId id

}
