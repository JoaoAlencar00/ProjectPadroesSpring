package com.example.patterns.factory;

import com.example.patterns.model.Pedido;
import com.example.patterns.discount.DiscountStrategy;
import com.example.patterns.discount.NoDiscount;
import com.example.patterns.discount.TenPercentDiscount;

public class PedidoFactory {

    public static Pedido criarPedido(String tipo, String produto, double valor) {
        DiscountStrategy discount;

        switch (tipo.toLowerCase()) {
            case "desconto10":
                discount = new TenPercentDiscount();
                break;
            default:
                discount = new NoDiscount();
        }

        return new Pedido(produto, valor, discount);
    }
}
