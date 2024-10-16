// Validar un correo

import java.util.Scanner;

public class EmailValidador {
    // Ejemplo de uso
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la dirección de correo electrónico
        System.out.print("Ingrese su dirección de correo electrónico: ");
        String email = scanner.next();

        // Validar la dirección de correo electrónico usando ifs
        boolean isValid = false;

        // Verificar si contiene '@'
        if (email.contains("@")) { // contains() verifica si la cadena contiene el carácter especificado
            int atIndex = email.indexOf("@"); // indexOf() devuelve la posición del carácter especificado
            String localPart = email.substring(0, atIndex); // substring() extrae una parte de la cadena desde el inicio hasta la posición indicada
            String domainPart = email.substring(atIndex + 1); // substring() extrae la parte de la cadena después del carácter '@'

            // Verificar que la parte local no esté vacía
            if (!localPart.isEmpty()) { // isEmpty() verifica si la cadena está vacía
                // Verificar si la parte del dominio contiene un punto
                if (domainPart.contains(".")) { // contains() verifica si la cadena contiene el carácter especificado
                    int dotIndex = domainPart.indexOf("."); // indexOf() devuelve la posición del primer punto en la cadena
                    String domainName = domainPart.substring(0, dotIndex); // substring() extrae el nombre del dominio antes del primer punto
                    String topLevelDomain = domainPart.substring(dotIndex + 1); // substring() extrae el dominio de nivel superior después del punto

                    // Verificar que el nombre de dominio y el dominio de nivel superior no estén vacíos
                    if (!domainName.isEmpty() && !topLevelDomain.isEmpty()) { // isEmpty() verifica si las cadenas están vacías
                        isValid = true;
                    }
                }
            }
        }

        if (isValid) {
            System.out.println("La dirección de correo electrónico es válida.");
        } else {
            System.out.println("La dirección de correo electrónico no es válida.");
        }

        scanner.close();
    }
}
