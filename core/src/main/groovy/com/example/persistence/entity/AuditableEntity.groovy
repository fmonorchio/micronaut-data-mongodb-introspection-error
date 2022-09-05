package com.example.persistence.entity

import io.micronaut.data.annotation.DateCreated
import io.micronaut.data.annotation.DateUpdated
import io.micronaut.data.annotation.Version

import java.time.Instant

abstract class AuditableEntity {

    @DateCreated
    Instant createdAt

    @DateUpdated
    Instant updatedAt

    @Version
    Long version

}
