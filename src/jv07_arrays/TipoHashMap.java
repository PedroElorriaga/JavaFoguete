package jv07_arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TipoHashMap {
    public static void main(String[] args) {
        Map<String,String> mapa = new HashMap<>();
        mapa.put("jogador1","Andre");
        mapa.put("jogador2","Garro");
        mapa.put("jogador3","Memphis");

        System.out.println(mapa);
        // {jogador1=Andre, jogador3=Memphis, jogador2=Garro} Saida parecida com objetos em Python

        for (String key : mapa.keySet()) {
            String value = mapa.get(key);
            System.out.println(value);
            // Andre Memphis Garro
        }
    }
}
