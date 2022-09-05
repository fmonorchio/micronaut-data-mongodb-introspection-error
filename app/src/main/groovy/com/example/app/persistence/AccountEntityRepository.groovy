package com.example.app.persistence

import com.example.core.persistence.repository.MongoEntityRepository
import io.micronaut.data.mongodb.annotation.MongoRepository

@MongoRepository
interface AccountEntityRepository extends MongoEntityRepository<AccountEntity> {

}
