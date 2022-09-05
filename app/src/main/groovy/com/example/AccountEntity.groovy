package com.example

import com.example.persistence.entity.MongoEntity
import io.micronaut.data.annotation.MappedEntity
import jakarta.persistence.Table

@MappedEntity
@Table(name = 'accounts')
class AccountEntity extends MongoEntity {

    String username

    String email

}
