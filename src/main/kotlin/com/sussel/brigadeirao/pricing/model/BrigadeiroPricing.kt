package com.sussel.brigadeirao.pricing.model

import kotlin.random.Random

data class BrigadeiroPricing (
    val pricePerUnit: Double = Random.nextDouble(2.0, 5.0),
    val sameDayPickupPrice: Double = Random.nextDouble(2.0, 6.0)
)