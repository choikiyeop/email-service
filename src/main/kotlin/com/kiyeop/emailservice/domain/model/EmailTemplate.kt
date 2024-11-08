package com.kiyeop.emailservice.domain.model

data class EmailTemplate(
    val id: String,
    val name: String,
    val content: String,
    val variables: Map<String, String>
)
