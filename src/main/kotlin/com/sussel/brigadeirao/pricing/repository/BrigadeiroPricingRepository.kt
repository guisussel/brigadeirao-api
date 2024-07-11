package com.sussel.brigadeirao.pricing.repository

import com.sussel.brigadeirao.pricing.model.BrigadeiroPricing
import org.springframework.stereotype.Repository

@Repository
class BrigadeiroPricingRepository {
    fun getBrigadeiroPricing(): BrigadeiroPricing {
        return BrigadeiroPricing()
    }
}