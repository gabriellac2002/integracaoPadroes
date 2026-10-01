package integracaopadroes;

public class EtiquetaMotoboy implements Etiqueta {

    public String gerar(Pedido pedido) {
        return "Etiqueta do Motoboy para " + pedido.getDestinatario();
    }
}
