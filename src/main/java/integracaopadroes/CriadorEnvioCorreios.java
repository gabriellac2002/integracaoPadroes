package integracaopadroes;

public class CriadorEnvioCorreios extends CriadorEnvio {

    public CriadorEnvioCorreios() {
        super(new FabricaDocumentosCorreios());
    }

    protected Envio criarEnvio() {
        return new EnvioCorreios();
    }
}
