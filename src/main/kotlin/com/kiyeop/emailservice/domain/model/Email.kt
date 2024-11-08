package com.kiyeop.emailservice.domain.model

data class Email(
    val id: String? = null,
    val to: String,
    val subject: String,
    val body: String,
    val status: EmailStatus = EmailStatus.PENDING,
    val template: EmailTemplate? = null,
    val createdAt: String,
)
