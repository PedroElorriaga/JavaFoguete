package jv04_enum.enums;

public enum TipoEnum {
    SAO_PAULO ("SP", "CENTRO OESTE"),
    RIO_DE_JANEIRO ("RJ", "CENTRO OESTE"),
    CEARA ("CE", "NORDESTE"),
    RIO_GRANDE_DO_SUL ("RS", "SUL");

    private final String uf;
    private final String regiao;

    private TipoEnum(String uf, String regiao) {
        this.uf = uf;
        this.regiao = regiao;
    }

    public String getUf() {
        return uf;
    }
    public String getRegiao() {
        return regiao;
    }

}
