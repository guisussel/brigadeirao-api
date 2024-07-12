package com.sussel.brigadeirao.order.controller

import com.sussel.brigadeirao.order.model.Order
import com.sussel.brigadeirao.order.model.OrderStatus
import com.sussel.brigadeirao.order.service.OrderService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class OrderController(val orderService: OrderService) {

    @PostMapping("/order")
    fun createOrder(@RequestBody order: Order): ResponseEntity<Order> {
        println("OrderController - createOrder order: $order")
        return ResponseEntity(order, HttpStatus.CREATED)
    }

    @GetMapping("/order/status")
    fun getOrderStatus(): ResponseEntity<OrderStatus> {
        val status = orderService.getOrderStatus()
        println("OrderController - getOrderStatus")
        return ResponseEntity.ok(status)
    }

    @PostMapping("/status")
    fun updateOrderStatus(@RequestBody status: OrderStatus): ResponseEntity<Void> {
        orderService.updateOrderStatus(status)
        println("OrderController - updateOrderStatus")
        return ResponseEntity.ok().build()
    }

    @PostMapping("/order/receive")
    fun receiveOrder(@RequestBody order: Order): ResponseEntity<Void> {
        orderService.receiveOrder(order)
        println("OrderController - receiveOrder order: $order")
        return ResponseEntity.ok().build()
    }

}