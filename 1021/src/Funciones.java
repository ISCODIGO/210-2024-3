public class Funciones {
    static void ejemploFuncion() {
        System.out.println("Esta es una prueba");
        System.out.println("de la ejecucion de una funcion");
    }

    static int sumar(int a, int b) {
        return a + b;
    }

    static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    static float sumar(float a, float b) {
        return a + b;
    }

    static float multiplicar(float ...args) {
        float resultado = 1;

        if (args.length == 0) {
            return 0;
        }

        // recorrer el array denominado args
        for (float elemento : args) {
            resultado *= elemento;
        }

        return resultado;
    }

    public static void main(String[] args) {
        ejemploFuncion();
        ejemploFuncion();
        System.out.println(sumar(3, 4f));

        System.out.println("Mult de 1 parametro: " +
                multiplicar(1)
        );

        System.out.println("Mult de 2 parametro: " +
                multiplicar(1, 2)
        );

        System.out.println("Mult de 3 parametro: " +
                multiplicar(10, 20, 30)
        );

        System.out.println("Mult de 0 parametro: " +
                multiplicar()
        );
    }
}
