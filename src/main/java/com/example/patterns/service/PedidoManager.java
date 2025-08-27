package com.example.patterns.service;

import com.example.patterns.model.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoManager {
    private static PedidoManager instance;
    private List<Pedido> pedidos;

    private PedidoManager() {
        pedidos = new ArrayList<>();
    }

    public static PedidoManager getInstance() {
        if (instance == null) {
            instance = new PedidoManager();
        }
        return instance;
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void listarPedidos() {
        pedidos.forEach(System.out::println);
    }
}
