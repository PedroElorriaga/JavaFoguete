package jv04_enum;

import jv04_enum.enums.TipoEnum;

public class EnumApp {
    public static void main(String[] args) {
        TipoEnum saoPaulo = TipoEnum.SAO_PAULO;
        System.out.println(saoPaulo.getUf());
        System.out.println(saoPaulo.getRegiao());
    }
}
