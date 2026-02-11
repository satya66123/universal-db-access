<?php

class OrderRepository
{
    private PDO $connection;

    public function __construct(PDO $connection)
    {
        $this->connection = $connection;
    }

    public function findOrdersByUser(int $userId): array
    {
        $sql = "
            SELECT o.id AS order_id,
                   p.name AS product_name,
                   oi.quantity
            FROM orders o
            JOIN order_items oi ON o.id = oi.order_id
            JOIN products p ON oi.product_id = p.id
            WHERE o.user_id = :userId
        ";

        $stmt = $this->connection->prepare($sql);
        $stmt->execute(['userId' => $userId]);

        return $stmt->fetchAll(PDO::FETCH_ASSOC);
    }
}
