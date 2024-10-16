public class IfDemo {
    public static void ejemplo(int numero) {
        System.out.println("Probando con numero: " + numero);

        // If sencillo
        if (numero > 5) {
            System.out.println("Bloque if sencillo: El número es mayor que 5.");
        }

        // If-else
        if (numero % 2 == 0) {
            System.out.println("Bloque if-else: El número es par.");
        } else {
            System.out.println("Bloque if-else: El número es impar.");
        }

        // else if
        if (numero > 0) {
            System.out.println("Bloque else-if: El número es positivo.");
        } else if (numero < 0) {
            System.out.println("Bloque else-if: El número es negativo.");
        } else {
            System.out.println("Bloque if-else if-else: El número es cero.");
        }

        // If anidado
        if (numero > 0) {
            System.out.println("Bloque if anidado: El número es positivo.");
            if (numero > 10) {
                System.out.println("Bloque if anidado: El número es mayor que 10.");
            } else {
                System.out.println("Bloque if anidado: El número es 10 o menor.");
            }
        }
    }

    public static void main(String[] args) {
        ejemplo(10);
    }
}

