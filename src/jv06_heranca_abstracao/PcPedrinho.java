package jv06_heranca_abstracao;

public class PcPedrinho {

    public static void main(String[] args) {
        SistemaZap zapZap = new SistemaZap();
        zapZap.enviarMensagens();
        zapZap.receberMensagens();

        SistemaTelegram sistemaTelegram = new SistemaTelegram();
        sistemaTelegram.enviarMensagens();
        sistemaTelegram.receberMensagens();
    }
}
