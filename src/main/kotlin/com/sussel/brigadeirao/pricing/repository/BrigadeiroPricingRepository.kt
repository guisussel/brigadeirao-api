package com.sussel.brigadeirao.pricing.repository

import com.sussel.brigadeirao.pricing.model.BrigadeiroPricing
import com.sussel.brigadeirao.utils.DecimalNumberFormatter
import org.springframework.stereotype.Repository

@Repository
class BrigadeiroPricingRepository {
    fun getBrigadeiroPricing(): BrigadeiroPricing {
        val brigadeiroPricing = DecimalNumberFormatter.format(BrigadeiroPricing())
        println("\nReturning brigadeiro pricing: $brigadeiroPricing")
        return brigadeiroPricing
    }
}