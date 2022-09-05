package com.example.core.persistence.entity

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.DateCreated
import io.micronaut.data.annotation.DateUpdated
import io.micronaut.data.annotation.Version

import java.time.Instant

@Introspected
abstract class AuditableEntity {

    @DateCreated
    Instant createdAt

    @DateUpdated
    Instant updatedAt

    @Version
    Long version

}
