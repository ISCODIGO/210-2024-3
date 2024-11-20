package otros;

@FunctionalInterface
interface Operacion {
    int calcular(int a, int b);
}


public class LambdaEjemplo {
    public static void main(String[] args) {
        // Expresión lambda para sumar dos números
        Operacion suma = (int a, int b) -> a + b;

        // Expresión lambda para multiplicar dos números
        Operacion multiplicacion = (a, b) -> a * b;

        // Uso de las lambdas
        System.out.println("Suma: " + suma.calcular(5, 3)); // Salida: 8
        System.out.println("Multiplicación: " + multiplicacion.calcular(5, 3)); // Salida: 15
    }
}
