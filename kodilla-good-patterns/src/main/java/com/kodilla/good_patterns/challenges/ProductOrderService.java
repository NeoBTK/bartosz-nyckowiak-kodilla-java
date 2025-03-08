package com.kodilla.good_patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    public boolean order(final User user, final Product product, final LocalDateTime orderDateTime) {
        System.out.println("Order status: " + user.getUserame() + " ordered " + product.getName() + " on "
                            + orderDateTime.toString());
        return true;
    }
}
