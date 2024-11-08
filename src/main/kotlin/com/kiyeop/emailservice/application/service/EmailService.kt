package com.kiyeop.emailservice.application.service

import com.kiyeop.emailservice.application.port.`in`.EmailUseCase
import com.kiyeop.emailservice.application.port.out.EmailPort
import com.kiyeop.emailservice.domain.model.Email
import com.kiyeop.emailservice.domain.model.EmailStatus
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class EmailService(
    private val emailPort: EmailPort,
    private val emailRepository: EmailRepository,
): EmailUseCase {
    private val log = LoggerFactory.getLogger(this::class.java)

    override suspend fun sendEmail(email: Email): Email {
        val savedEmail = emailRepository.save(email)

        return try {
            val success = emailPort.sendEmail(email)
            if (success) {
                emailRepository.updateStatus(savedEmail.id!!, EmailStatus.SUCCESS)
            } else {
                emailRepository.updateStatus(savedEmail.id!!, EmailStatus.FAILURE)
            }
        } catch (e: Exception) {
            log.error("Failed to send email: ${e.message}", e)
            emailRepository.updateStatus(savedEmail.id!!, EmailStatus.FAILURE)
        }
    }

    override suspend fun sendEmailWithTemplate(template: String, to: String, variables: Map<String, String>): Email {
        TODO("Not yet implemented")
    }

    override suspend fun resendEmail() {
        TODO("Not yet implemented")
    }

    override suspend fun getEmailStatus(emailId: String): EmailStatus {
        TODO("Not yet implemented")
    }


}