package jv01_sintaxe_ex;

import java.time.LocalDate;

public class Conta {
    Integer conta;
    String agencia;
    String nomeCliente;
    LocalDate dataNascimento;
    Double saldo;

    // CONSTRUTOR
    public Conta(Integer conta,
                 String agencia,
                 String nomeCliente,
                 LocalDate dataNascimento,
                 Double saldo) {
        this.conta = conta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.dataNascimento = dataNascimento;
        this.saldo = saldo;
    }

    public void verificarSaldo(){
        if(this.saldo > 0){
            System.out.println("Saldo atual: " + this.saldo);
        }
        else {
            System.out.println("Saldo atual: " + this.saldo + " cuidado, você esta negativo");
        }
    }

    public void sacar(Double valor){
        if (this.saldo < valor){
            System.out.println("Saldo insuficiente");
        }
        else {
            this.saldo -= this.saldo;
            System.out.println("Saque efetuado com sucesso");
        }
    }
}
