package integracaopadroes;

public class EnvioCorreios implements Envio {

    public String enviar(Pedido pedido) {
        return "Pedido " + pedido.getCodigo() + " enviado pelos Correios";
    }
}
