package com.kiyeop.emailservice.application.port.out

import com.kiyeop.emailservice.domain.model.Email

interface EmailPort {
    suspend fun sendEmail(email: Email): Boolean
}