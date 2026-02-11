package com.example.universaldb.repository;

import com.example.universaldb.document.OrderDocument;
import com.example.universaldb.document.OrderItem;
import com.example.universaldb.model.OrderDTO;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MongoOrderRepository {

    private final MongoTemplate mongoTemplate;

    public MongoOrderRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public List<OrderDTO> findOrdersByUser(int userId) {

        Query query = new Query();
        query.addCriteria(Criteria.where("userId").is(userId));

        List<OrderDocument> orders =
                mongoTemplate.find(query, OrderDocument.class);

        List<OrderDTO> result = new ArrayList<>();

        for (OrderDocument order : orders) {
            for (OrderItem item : order.getItems()) {

                OrderDTO dto = new OrderDTO();
                dto.setOrderId(order.getOrderId());
                dto.setProductName(item.getProductName());
                dto.setQuantity(item.getQuantity());

                result.add(dto);
            }
        }

        return result;
    }
}
