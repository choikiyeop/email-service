package com.kiyeop.emailservice.application.port.`in`

import com.kiyeop.emailservice.domain.model.Email
import com.kiyeop.emailservice.domain.model.EmailStatus

interface EmailUseCase {
    suspend fun sendEmail(email: Email): Email
    suspend fun sendEmailWithTemplate(template: String, to: String, variables: Map<String, String>): Email
    suspend fun resendEmail()
    suspend fun getEmailStatus(emailId: String): EmailStatus
}