package com.kodilla.good_patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("wiesiek");

        Product product = new Product("Slippers");

        LocalDateTime orderDateTime = LocalDateTime.of(2025, 3, 5, 10, 10, 0);

        return new OrderRequest(user, product, orderDateTime);
    }
}
