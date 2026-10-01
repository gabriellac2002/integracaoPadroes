package integracaopadroes;

public class GerenciadorEnvios {

    private static final GerenciadorEnvios INSTANCE = new GerenciadorEnvios();

    private GerenciadorEnvios() {
    }

    // Singleton: há um único ponto central para processar os envios.
    public static GerenciadorEnvios getInstance() {
        return INSTANCE;
    }

    public ResultadoEnvio processarPedido(Pedido pedido, TipoEnvio tipoEnvio) {
        CriadorEnvio criador = switch (tipoEnvio) {
            case CORREIOS -> new CriadorEnvioCorreios();
            case MOTOBOY -> new CriadorEnvioMotoboy();
        };

        return criador.prepararEnvio(pedido);
    }
}
