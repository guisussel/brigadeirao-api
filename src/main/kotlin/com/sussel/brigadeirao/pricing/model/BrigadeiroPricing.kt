package com.sussel.brigadeirao.pricing.model

import kotlin.random.Random

data class BrigadeiroPricing (
    val pricePerBrigadeiroUnit: Double = Random.nextDouble(2.0, 5.0),
    val priceForSameDayPickup: Double = Random.nextDouble(2.0, 6.0)
)