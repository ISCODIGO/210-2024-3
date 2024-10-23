import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        String s = "hola";
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba un numero: ");
        int numero = entrada.nextInt();
        System.out.println("El doble es: " + (numero * 2));
    }
}
