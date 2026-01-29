package jv05_encapsulamento;

import java.util.ArrayList;
import java.util.List;

public class Mensages {
    public void enviarMensagem() {
        // Encapsulamento ao usar metodo privado para fazer a verificacao
        if (verificarStatus()){
            System.out.println("Usuario online");
            System.out.println("Mensagem enviada com sucesso!");
        } else {
            System.out.println("Usuario offilne");
        }
    }

    public void recebeMensagem() {
        if (verificarStatus()){
            System.out.println("Mensagem recebida com sucesso!");
        } else {
            System.out.println("Usuario offilne");
        }
    }

    private boolean verificarStatus() {
        return true;
    }

    private void salvarHistorico() {
        System.out.println("Historico salvo");
    }
}
