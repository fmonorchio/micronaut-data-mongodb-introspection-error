package com.example.app.persistence

import com.example.core.persistence.entity.MongoEntity
import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.Relation
import jakarta.persistence.Table

import static io.micronaut.data.annotation.Relation.*

@Introspected
@MappedEntity
@Table(name = 'accounts')
class AccountEntity extends MongoEntity {

    String username

    String email

    @Relation(
            value = Kind.ONE_TO_ONE,
            cascade = Cascade.ALL
    )
    UserEntity user

}
