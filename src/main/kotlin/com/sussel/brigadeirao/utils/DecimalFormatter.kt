package com.sussel.brigadeirao.utils

import com.sussel.brigadeirao.pricing.model.BrigadeiroPricing
import java.text.DecimalFormat

object DecimalNumberFormatter {
    private val decimalFormat = DecimalFormat("#.00")

    fun format(pricing: BrigadeiroPricing): BrigadeiroPricing {
        return BrigadeiroPricing(
            decimalFormat.format(pricing.pricePerUnit).replace(",", ".").toDouble(),
            decimalFormat.format(pricing.sameDayPickupPrice).replace(",", ".").toDouble(),
        )
    }

}