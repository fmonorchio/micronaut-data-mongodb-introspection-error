package com.example

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
                email: 'fmonorchio@gmail.com'
        )

        return accountEntityRepository.save(account)
    }

}
