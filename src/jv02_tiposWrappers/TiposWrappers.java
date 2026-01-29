package jv02_tiposWrappers;

public class TiposWrappers {
    public static void main(String[] args) {
        // Conversao explicita
        double noWrapper = 100.22;
        int noIntWrapper = (int) noWrapper;
        System.out.println(noIntWrapper); // 100

        // Conversao implicita
        Double wrapper = 100.22;
        Integer intWrapper = wrapper.intValue();
        System.out.println(intWrapper); //100
    }
}
