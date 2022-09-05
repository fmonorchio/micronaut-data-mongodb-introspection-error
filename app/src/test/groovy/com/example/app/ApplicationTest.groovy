package com.example.app

import com.example.app.persistence.AccountEntity
import com.example.app.persistence.AccountEntityRepository
import com.example.app.persistence.UserEntity
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
class ApplicationTest extends Specification {

    @Inject
    AccountEntityRepository accountEntityRepository

    def 'Should create an account'() {

        given:
        def account = new AccountEntity(
                username: 'fmonorchio',
                email: 'fmonorchio@gmail.com',
                user: new UserEntity(
                        firstname: 'frank',
                        lastname: 'monorchio'
                )
        )

        when:
        def savedAccount = accountEntityRepository.save(account)

        then:
        noExceptionThrown()
        savedAccount.id
    }

}
