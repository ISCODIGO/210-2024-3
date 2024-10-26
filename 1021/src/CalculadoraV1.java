import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraV1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Escriba un numero: ");
            //entrada.close();
            int n1 = entrada.nextInt();

            entrada.nextLine();  // para limpiar un token disponible

            System.out.print("Escriba otro numero: ");
            int n2 = entrada.nextInt();

            System.out.println("La division es: " + (n1 % n2));

            int[] arreglo = {1, 2, 3, 4};
            System.out.println(arreglo[n1]);

        }
        catch (Exception e4) {
            System.out.println("\nHubo una excepcion: " + e4.getMessage());
            //e4.printStackTrace();
        }
        finally {
            System.out.println("Siempre se ejecuta este bloque");
            entrada.close();
        }


        System.out.println("Programa terminado");
    }
}
