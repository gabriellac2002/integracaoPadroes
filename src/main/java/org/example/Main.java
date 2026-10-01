package org.example;

import integracaopadroes.GerenciadorEnvios;
import integracaopadroes.Pedido;
import integracaopadroes.ResultadoEnvio;
import integracaopadroes.TipoEnvio;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("PED-100", "Ana");
        ResultadoEnvio resultado = GerenciadorEnvios.getInstance()
                .processarPedido(pedido, TipoEnvio.CORREIOS);

        System.out.println(resultado.getMensagemEnvio());
        System.out.println(resultado.getNotaFiscal());
        System.out.println(resultado.getEtiqueta());
    }
}
