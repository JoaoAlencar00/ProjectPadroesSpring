package com.example.patterns.model;

import com.example.patterns.discount.DiscountStrategy;

public class Pedido {
    private String produto;
    private double valor;
    private DiscountStrategy discountStrategy;

    public Pedido(String produto, double valor, DiscountStrategy discountStrategy) {
        this.produto = produto;
        this.valor = valor;
        this.discountStrategy = discountStrategy;
    }

    public double getValorComDesconto() {
        return discountStrategy.applyDiscount(valor);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "produto='" + produto + '\'' +
                ", valor=" + valor +
                ", valor com desconto=" + getValorComDesconto() +
                '}';
    }
}

