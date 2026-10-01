package integracaopadroes;

public class FabricaDocumentosMotoboy implements FabricaDocumentosEnvio {

    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalMotoboy();
    }

    public Etiqueta criarEtiqueta() {
        return new EtiquetaMotoboy();
    }
}
