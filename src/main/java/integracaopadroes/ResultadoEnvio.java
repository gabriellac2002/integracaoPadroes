package integracaopadroes;

public class ResultadoEnvio {

    private final String mensagemEnvio;
    private final String notaFiscal;
    private final String etiqueta;

    public ResultadoEnvio(String mensagemEnvio, String notaFiscal, String etiqueta) {
        this.mensagemEnvio = mensagemEnvio;
        this.notaFiscal = notaFiscal;
        this.etiqueta = etiqueta;
    }

    public String getMensagemEnvio() {
        return mensagemEnvio;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public String getEtiqueta() {
        return etiqueta;
    }
}
