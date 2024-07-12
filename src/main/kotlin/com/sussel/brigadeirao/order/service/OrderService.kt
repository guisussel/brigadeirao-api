package com.sussel.brigadeirao.order.service

import com.sussel.brigadeirao.order.model.Order
import com.sussel.brigadeirao.order.model.OrderStatus
import org.springframework.stereotype.Service
import java.time.Clock
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

@Service
class OrderService {

    private var currentOrder: Order? = null

    fun getOrderStatus(): OrderStatus {
        println("OrderService - getOrderStatus: ${currentOrder?.status}")
        return currentOrder?.status ?: throw IllegalStateException("No order found")
    }

    fun updateOrderStatus(status: OrderStatus) {
        println("OrderService - updateOrderStatus: ${currentOrder?.status} = $status")
        currentOrder?.status = status
    }

    fun receiveOrder(order: Order) {
        println("OrderService - receiveOrder: $order")
        currentOrder = order.apply { status = OrderStatus.RECEIVED }
        updateOrderStatusAutomatically()
    }

    private fun updateOrderStatusAutomatically() {
        val executor = Executors.newSingleThreadScheduledExecutor()
        val statusSequence = listOf(OrderStatus.PREPARING, OrderStatus.IN_ROUTE, OrderStatus.DELIVERED)
        var index = 0
        println("OrderService - updateOrderStatusAutomatically ON for $ order.id")
        val updateTask = Runnable {
            if (index < statusSequence.size) {
                currentOrder?.let {
                    it.status = statusSequence[index]
                    println("current order status = ${it.status}")
                    index++
                }
            } else {
                println("OrderService - updateOrderStatusAutomatically OFF for $ order.id")
                executor.shutdown()
            }
        }
        executor.scheduleAtFixedRate(updateTask, 5, 5, TimeUnit.SECONDS)
    }
}