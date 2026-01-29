package jv06_heranca_abstracao;

public class SistemaZap extends SistemaMensagens{

    @Override
    public void enviarMensagens() {
        System.out.println("Enviando mensagem Zap");
    }

    @Override
    public void receberMensagens() {
        System.out.println("Recebendo mensagem Zap");
    }
}
