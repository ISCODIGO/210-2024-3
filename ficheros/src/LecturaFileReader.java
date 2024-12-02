import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class LecturaFileReader {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("data.txt");
        // Se lee un caracter a la vez
        int valor = reader.read();
        System.out.println((char) valor);

        // Se puede leer el tamaño del buffer
        char[] buffer = new char[100];
        int resultado = reader.read(buffer);

        System.out.print("Lectura de buffer:");
        for(int i = 0; i < resultado; i++) {
            System.out.print(buffer[i]);
        }
    }
}
