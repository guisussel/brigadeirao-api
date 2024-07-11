package com.sussel.brigadeirao.order.controller

import com.sussel.brigadeirao.order.model.Order
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class OrderController() {

    @PostMapping("/order")
    fun createOrder(@RequestBody order: Order): ResponseEntity<Order> {
        println("\nReceived order: $order.")
        return ResponseEntity(order, HttpStatus.CREATED)
    }
}