package jv01_sintaxe;

// APENAS PARA CONHECIMENTO
public class Conta {
    public void verificarSaldo(Double saldo, Integer conta) {
        if (saldo < 0 ) {
            String menssagem = String.format("Saldo da conta %d está negativado, seu saldo é %.2f", conta, saldo);
            System.out.println(menssagem);
            // Saldo da conta 1000 está negativado, seu saldo é -23,99
        }
    }
}