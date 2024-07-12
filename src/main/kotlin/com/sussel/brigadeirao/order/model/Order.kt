package com.sussel.brigadeirao.order.model

enum class OrderStatus {
    RECEIVED,
    PREPARING,
    IN_ROUTE,
    DELIVERED
}

data class Order(
    // TODO change pickupdate var type
    val pickUpDate: String,
    val total: Double,
    val quantity: Int,
    val filling: String,
    var status: OrderStatus = OrderStatus.RECEIVED //initial order status
)