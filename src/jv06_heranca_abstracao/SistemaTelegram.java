package jv06_heranca_abstracao;

public class SistemaTelegram extends SistemaMensagens{

    @Override
    public void enviarMensagens() {
        System.out.println("Enviando mensagem Telegram");
    }

    @Override
    public void receberMensagens() {
        System.out.println("Recebendo mensagem Telegram");
    }
}
