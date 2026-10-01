package integracaopadroes;

public class CriadorEnvioMotoboy extends CriadorEnvio {

    public CriadorEnvioMotoboy() {
        super(new FabricaDocumentosMotoboy());
    }

    protected Envio criarEnvio() {
        return new EnvioMotoboy();
    }
}
