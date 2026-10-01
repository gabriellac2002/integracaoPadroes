package integracaopadroes;

public class FabricaDocumentosCorreios implements FabricaDocumentosEnvio {

    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalCorreios();
    }

    public Etiqueta criarEtiqueta() {
        return new EtiquetaCorreios();
    }
}
