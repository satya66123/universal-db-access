package com.example.universaldb.repository;

import com.example.universaldb.model.OrderDTO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MySqlOrderRepository {

    private final JdbcTemplate jdbcTemplate;

    public MySqlOrderRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<OrderDTO> findOrdersByUser(int userId) {
        String sql = """
            SELECT o.id AS orderId,
                   p.name AS productName,
                   oi.quantity
            FROM orders o
            JOIN order_items oi ON o.id = oi.order_id
            JOIN products p ON oi.product_id = p.id
            WHERE o.user_id = ?
        """;

        return jdbcTemplate.query(sql, new Object[]{userId}, (rs, rowNum) -> {
            OrderDTO dto = new OrderDTO();
            dto.setOrderId(rs.getInt("orderId"));
            dto.setProductName(rs.getString("productName"));
            dto.setQuantity(rs.getInt("quantity"));
            return dto;
        });
    }
}
