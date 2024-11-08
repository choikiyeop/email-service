package com.kiyeop.emailservice.adapter.out.persistence.repository

import com.kiyeop.emailservice.domain.model.Email
import com.kiyeop.emailservice.domain.model.EmailStatus

interface EmailRepository {
    suspend fun save(email: Email): Email
    suspend fun findByEmail(id: String): Email?
    suspend fun findByStatus(status: EmailStatus): List<Email>
    suspend fun updateStatus(id: String, status: EmailStatus): Email
}