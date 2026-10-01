package integracaopadroes;

public class EnvioMotoboy implements Envio {

    public String enviar(Pedido pedido) {
        return "Pedido " + pedido.getCodigo() + " enviado por Motoboy";
    }
}
