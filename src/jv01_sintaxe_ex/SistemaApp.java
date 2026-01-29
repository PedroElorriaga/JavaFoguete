package jv01_sintaxe_ex;

import java.time.LocalDate;

// IDEIA AQUI É APRENDER A SINTAXE E NAO APLICAR LOGICA
public class SistemaApp {
    public static void main(String[] args) {
        Conta conta1 = new Conta(
                1,
                "0001",
                "Cliente 01",
                LocalDate.of(2002, 7, 1),
                390.87
        );
        Conta conta2 = new Conta(
                2,
                "0001",
                "Cliente 02",
                LocalDate.of(1995, 12, 8),
                -33.0
        );
    }
}
