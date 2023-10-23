package com.hanghae.commerce.payment.application

import com.hanghae.commerce.payment.domain.Payment
import com.hanghae.commerce.payment.domain.PaymentRepository
import org.springframework.stereotype.Component

@Component
class PaymentReader(
    private val paymentRepository: PaymentRepository,
) {
    fun read(id: String): Payment {
        return paymentRepository.findById(id) ?: throw IllegalArgumentException("결제 정보가 존재하지 않습니다.")
    }

    fun readByOrderId(id: String): Payment {
        return paymentRepository.findByOrderId(id) ?: throw IllegalArgumentException("결제 정보가 존재하지 않습니다.")
    }
}
