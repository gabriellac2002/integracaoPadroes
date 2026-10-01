package integracaopadroes;

public class NotaFiscalCorreios implements NotaFiscal {

    public String gerar(Pedido pedido) {
        return "Nota fiscal dos Correios para " + pedido.getCodigo();
    }
}
