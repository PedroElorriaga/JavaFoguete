package jv06_heranca_abstracao;

// EXTENDS É QUEM FAZ A HERANÇA
public class SistemaTelegram extends SistemaMensagens{

    // ANOTACAO QUE ESTA SUBSTITUINDO O METODO DA CLASSE PAI
    @Override
    public void enviarMensagens() {
        System.out.println("Enviando mensagem Telegram");
    }

    @Override
    public void receberMensagens() {
        System.out.println("Recebendo mensagem Telegram");
    }
}
