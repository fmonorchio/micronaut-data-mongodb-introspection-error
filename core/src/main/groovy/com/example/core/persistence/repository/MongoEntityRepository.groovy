package com.example.core.persistence.repository

import com.example.core.persistence.entity.MongoEntity
import io.micronaut.data.repository.CrudRepository
import org.bson.types.ObjectId

interface MongoEntityRepository<E extends MongoEntity>
        extends CrudRepository<E, ObjectId> {

}
