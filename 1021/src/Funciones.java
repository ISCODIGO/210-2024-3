public class Funciones {
    static void ejemploFuncion() {
        System.out.println("Esta es una prueba");
        System.out.println("de la ejecucion de una funcion");
    }

    static int sumar(int a, int b) {
        return a + b;
    }

    static float sumar(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        ejemploFuncion();
        ejemploFuncion();
        System.out.println(sumar(3, 4));
    }
}
