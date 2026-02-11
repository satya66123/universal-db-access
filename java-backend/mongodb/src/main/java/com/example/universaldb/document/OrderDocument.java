package com.example.universaldb.document;

import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "orders")
public class OrderDocument {

    private int userId;
    private int orderId;
    private List<OrderItem> items;

    public OrderDocument() {
    }

    public OrderDocument(int userId, int orderId, List<OrderItem> items) {
        this.userId = userId;
        this.orderId = orderId;
        this.items = items;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
}
