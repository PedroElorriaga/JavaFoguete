package jv07_arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TipoSet {
    public static void main(String[] args) {
        Set<String> tipoSet = new HashSet<>();
        tipoSet.add("Garro");
        tipoSet.add("Bidon");
        tipoSet.add("Memphis");
        tipoSet.add("Garro");

        System.out.println(tipoSet);
        // [Garro, Memphis, Bidon] Ele nao deixa duplicar

        Set<String> tipoSet2 = new TreeSet<>();
        tipoSet2.add("Garro");
        tipoSet2.add("Memphis");
        tipoSet2.add("Bidon");
        tipoSet2.add("Bidu");
        tipoSet2.add("Andre");

        System.out.println(tipoSet2);
        // [Andre, Bidon, Bidu, Garro, Memphis] Organiza em forma alfabetica

        /*
        * Mas devemos tomar cuidado, pois ele roda um algoritmo por tras, e se sua aplicacao preza a performance
        * devemos primeiro jogar as entregar em uma lista para ai sim jogar dentro de um TreeSet
        * */
    }
}
