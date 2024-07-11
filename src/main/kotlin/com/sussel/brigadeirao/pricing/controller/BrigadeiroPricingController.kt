package com.sussel.brigadeirao.pricing.controller

import com.sussel.brigadeirao.pricing.service.BrigadeiroPricingService
import com.sussel.brigadeirao.pricing.model.BrigadeiroPricing
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class BrigadeiroPricingController (private val service: BrigadeiroPricingService) {

    @GetMapping("/pricing")
    fun getBrigadeiroPricing(): BrigadeiroPricing {
        return service.getPricing()
    }
}