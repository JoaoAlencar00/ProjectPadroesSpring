package com.example.patterns.discount;

public class TenPercentDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.9;
    }
}
