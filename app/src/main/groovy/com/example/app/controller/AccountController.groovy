package com.example.app.controller

import com.example.app.persistence.AccountEntity
import com.example.app.persistence.AccountEntityRepository
import com.example.app.persistence.UserEntity
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import jakarta.inject.Inject

@Controller('/api/accounts')
class AccountController {

    @Inject
    AccountEntityRepository accountEntityRepository

    @Post
    AccountEntity registerAccount() {

        def account = new AccountEntity(
                username: 'fmonorchio',
                email: 'fmonorchio@gmail.com',
                user: new UserEntity(
                        firstname: 'frank',
                        lastname: 'monorchio'
                )
        )

        return accountEntityRepository.save(account)
    }

}
