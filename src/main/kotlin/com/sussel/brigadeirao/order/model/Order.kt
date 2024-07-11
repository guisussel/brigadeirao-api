package com.sussel.brigadeirao.order.model

data class Order(
    // TODO change pickupdate var type
    val pickUpDate: String,
    val total: Double,
    val numberOfBrigadeiros: Int,
    val filling: String
)