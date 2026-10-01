package integracaopadroes;

public class NotaFiscalMotoboy implements NotaFiscal {

    public String gerar(Pedido pedido) {
        return "Nota fiscal do Motoboy para " + pedido.getCodigo();
    }
}
