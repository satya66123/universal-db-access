<?php

require_once 'OrderRepository.php';

class OrderService
{
    private OrderRepository $repository;

    public function __construct(OrderRepository $repository)
    {
        $this->repository = $repository;
    }

    public function getOrdersForUser(int $userId): array
    {
        return $this->repository->findOrdersByUser($userId);
    }
}
