package integracaopadroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class GerenciadorEnviosTest {

    @Test
    void deveRetornarMesmaInstanciaDoGerenciador() {
        GerenciadorEnvios primeiroGerenciador = GerenciadorEnvios.getInstance();
        GerenciadorEnvios segundoGerenciador = GerenciadorEnvios.getInstance();

        assertSame(primeiroGerenciador, segundoGerenciador);
    }

    @Test
    void deveProcessarPedidoPelosCorreiosComDocumentosCompativeis() {
        Pedido pedido = new Pedido("PED-100", "Ana");

        ResultadoEnvio resultado = GerenciadorEnvios.getInstance()
                .processarPedido(pedido, TipoEnvio.CORREIOS);

        assertEquals("Pedido PED-100 enviado pelos Correios", resultado.getMensagemEnvio());
        assertEquals("Nota fiscal dos Correios para PED-100", resultado.getNotaFiscal());
        assertEquals("Etiqueta dos Correios para Ana", resultado.getEtiqueta());
    }

    @Test
    void deveProcessarPedidoPorMotoboyComDocumentosCompativeis() {
        Pedido pedido = new Pedido("PED-200", "Bruno");

        ResultadoEnvio resultado = GerenciadorEnvios.getInstance()
                .processarPedido(pedido, TipoEnvio.MOTOBOY);

        assertEquals("Pedido PED-200 enviado por Motoboy", resultado.getMensagemEnvio());
        assertEquals("Nota fiscal do Motoboy para PED-200", resultado.getNotaFiscal());
        assertEquals("Etiqueta do Motoboy para Bruno", resultado.getEtiqueta());
    }
}
