package com.kodilla.good_patterns.challenges;

public class OrderDto {
    private User userame;
    private boolean isOrdered;

    public OrderDto(User userame, boolean isOrdered) {
        this.userame = userame;
        this.isOrdered = isOrdered;
    }

    public User getUserame() { return userame; }
    public boolean isOrdered() { return isOrdered; }
}
