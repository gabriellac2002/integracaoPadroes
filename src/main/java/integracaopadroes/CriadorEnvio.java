package integracaopadroes;

public abstract class CriadorEnvio {

    private final FabricaDocumentosEnvio fabricaDocumentos;

    protected CriadorEnvio(FabricaDocumentosEnvio fabricaDocumentos) {
        this.fabricaDocumentos = fabricaDocumentos;
    }

    // Factory Method: cada subclasse escolhe o tipo concreto de envio.
    protected abstract Envio criarEnvio();

    public ResultadoEnvio prepararEnvio(Pedido pedido) {
        Envio envio = criarEnvio();
        NotaFiscal notaFiscal = fabricaDocumentos.criarNotaFiscal();
        Etiqueta etiqueta = fabricaDocumentos.criarEtiqueta();

        return new ResultadoEnvio(
                envio.enviar(pedido),
                notaFiscal.gerar(pedido),
                etiqueta.gerar(pedido)
        );
    }
}
