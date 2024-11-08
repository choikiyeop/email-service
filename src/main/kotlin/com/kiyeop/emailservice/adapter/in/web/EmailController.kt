package com.kiyeop.emailservice.adapter.`in`.web

import com.kiyeop.emailservice.adapter.`in`.web.request.SendEmailRequest
import com.kiyeop.emailservice.adapter.`in`.web.response.EmailResponse
import com.kiyeop.emailservice.application.port.`in`.EmailUseCase
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/email")
class EmailController(
    private val emailUseCase: EmailUseCase
) {

    @PostMapping("/send")
    suspend fun sendEmail(@Valid @RequestBody request: SendEmailRequest) {

    }
}