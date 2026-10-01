package integracaopadroes;

public class Pedido {

    private final String codigo;
    private final String destinatario;

    public Pedido(String codigo, String destinatario) {
        this.codigo = codigo;
        this.destinatario = destinatario;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDestinatario() {
        return destinatario;
    }
}
