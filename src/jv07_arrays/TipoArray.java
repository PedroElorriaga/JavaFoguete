package jv07_arrays;

import java.util.Arrays;

public class TipoArray {
    public static void main(String[] args) {
        Integer[] tipoArray = {2, 4, 6, 8, 10};
        for (Integer integer : tipoArray) {
            System.out.println(integer);
            // 2 4 6 8 10
        }

        // Outra forma de definir array
        Integer[] tipoArray2 = new Integer[2];
        tipoArray2[0] = 1;
        tipoArray2[1] = 2;

        System.out.println(Arrays.toString(tipoArray2));
    }
}
