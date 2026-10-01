package integracaopadroes;

public class EtiquetaCorreios implements Etiqueta {

    public String gerar(Pedido pedido) {
        return "Etiqueta dos Correios para " + pedido.getDestinatario();
    }
}
