package com.kiyeop.emailservice.adapter.out.smtp

import org.springframework.mail.javamail.JavaMailSender

class SmtpEmailAdapter(
    private val javaMailSender: JavaMailSender,
) {

}