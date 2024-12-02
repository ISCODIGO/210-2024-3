import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscrituraPrintWriter {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("prueba.txt");
        for (int i = 0; i <= 100; i++) {
            pw.println(i);
        }
        pw.close();
    }
}