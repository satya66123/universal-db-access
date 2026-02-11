<?php

use MongoDB\Collection;

class OrderRepository
{
    private Collection $collection;

    public function __construct(Collection $collection)
    {
        $this->collection = $collection;
    }

    public function findOrdersByUser(int $userId): array
    {
        $cursor = $this->collection->find(['userId' => $userId]);

        $result = [];

        foreach ($cursor as $order) {
            foreach ($order['items'] as $item) {
                $result[] = [
                    'order_id' => $order['orderId'],
                    'product_name' => $item['productName'],
                    'quantity' => $item['quantity']
                ];
            }
        }

        return $result;
    }
}
