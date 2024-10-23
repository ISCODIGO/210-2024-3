public class Bloques {
    public static void main(String[] args) {
        System.out.println("Bloque main");
        int varMain = 10;

        while (varMain > 0) {
            System.out.println("Bloque while");
            varMain--;
        }

        do {
            System.out.println("Bloque do while");
            varMain--;
        } while (varMain > 0);

        int i;

        for (i = 1; i < 10; i *= 2) {
            System.out.println(i);
        }
        System.out.println("Este el ultimo valor de i: " + i);

        System.out.println("Hola");


    }
}
