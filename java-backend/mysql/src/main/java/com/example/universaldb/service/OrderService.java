package com.example.universaldb.service;

import com.example.universaldb.model.OrderDTO;
import com.example.universaldb.repository.MySqlOrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final MySqlOrderRepository repository;

    public OrderService(MySqlOrderRepository repository) {
        this.repository = repository;
    }

    public List<OrderDTO> getOrdersForUser(int userId) {
        return repository.findOrdersByUser(userId);
    }
}
