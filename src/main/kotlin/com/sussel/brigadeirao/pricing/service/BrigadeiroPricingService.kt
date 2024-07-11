package com.sussel.brigadeirao.pricing.service

import com.sussel.brigadeirao.pricing.model.BrigadeiroPricing
import com.sussel.brigadeirao.pricing.repository.BrigadeiroPricingRepository
import org.springframework.stereotype.Service

@Service
class BrigadeiroPricingService(private val repository: BrigadeiroPricingRepository) {
    fun getPricing(): BrigadeiroPricing {
        return repository.getBrigadeiroPricing()
    }
}