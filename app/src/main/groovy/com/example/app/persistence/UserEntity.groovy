package com.example.app.persistence

import com.example.core.persistence.entity.MongoEntity
import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.MappedEntity
import jakarta.persistence.Table

@Introspected
@MappedEntity
@Table(name = 'users')
class UserEntity extends MongoEntity {

    String firstname

    String lastname

}
