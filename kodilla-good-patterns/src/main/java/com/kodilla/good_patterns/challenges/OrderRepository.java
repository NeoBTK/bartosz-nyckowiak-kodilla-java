package com.kodilla.good_patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {

    void createOrder(User user, Product product, LocalDateTime orderDateTime);
}
