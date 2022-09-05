package com.example

import com.example.persistence.repository.MongoEntityRepository
import io.micronaut.data.mongodb.annotation.MongoRepository

@MongoRepository
interface AccountEntityRepository extends MongoEntityRepository<AccountEntity> {

}
