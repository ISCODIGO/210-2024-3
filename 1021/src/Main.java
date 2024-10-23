public class Main {
    public static void main(String[] args) {
        /*
        Tipos Primitivos            Objetos (wrapper/envoltorios)
        boolean                     Boolean

        byte                        Byte
        short                       Short
        int                         Integer
        long                        Long

        float                       Float
        double                      Double

        char                        Character
         */

        System.out.println("Byte (max): " + Byte.MAX_VALUE);
        System.out.println("Short (max): " + Short.MAX_VALUE);

        // Pregunta 1
        short anioNacimiento = 2000;
        byte edad = (byte)(2024 - anioNacimiento);
        System.out.println(edad);

        // Pregunta 2
        for (int i = 1; i <= edad; i++) {
            System.out.println(i);
        }

        // Pregunta 3
        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("A es mayor B");
        } else {
            System.out.println("A no es mayor B");
        }

        System.out.println("A es mayor que B: " + (a > b));

        // Pregunta 4
        float altura = 1.7F;
        System.out.println("La altura es: " + altura);

        // Pregunta 5
        int contador = 5;

        while (contador >= 0) {
            System.out.println(contador);
            contador--;
        }

        // Pregunta 6
        int x = 10;
        int y = 3;

        System.out.println("Suma: " + (x + y));
        System.out.println("Resta: " + (x - y));
        System.out.println("Mult: " + (x * y));
        System.out.println("Div: " + ((double) x / y));
        System.out.println("Modulo: " + (x % y));
    }
}