package com.example.universaldb.controller;

import com.example.universaldb.model.OrderDTO;
import com.example.universaldb.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping("/{userId}/orders")
    public List<OrderDTO> getUserOrders(@PathVariable int userId) {
        return service.getOrdersForUser(userId);
    }
}
