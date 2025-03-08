package com.kodilla.good_patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public void createOrder(User user, Product product, LocalDateTime orderDateTime) {
        System.out.println("Order has been created");
    }
}
