package com.example.patterns;

import com.example.patterns.factory.PedidoFactory;
import com.example.patterns.model.Pedido;
import com.example.patterns.service.PedidoManager;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = PedidoFactory.criarPedido("desconto10", "Notebook", 5000);
        Pedido pedido2 = PedidoFactory.criarPedido("normal", "Mouse", 200);

        PedidoManager manager = PedidoManager.getInstance();
        manager.addPedido(pedido1);
        manager.addPedido(pedido2);

        manager.listarPedidos();
    }
}
