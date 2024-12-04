import java.io.FileWriter;
import java.io.IOException;

public class EscrituraFileWriter {
    public static void main(String[] args) throws IOException {
        // append = false, sobrescribe el contenido del fichero
        FileWriter writerMayus = new FileWriter("abecedario.txt", false);

        for(int i = 65; i <= 90; i++) {
            writerMayus.write(Character.toString(i));
            writerMayus.write("\n");
        }
        writerMayus.close();

        // append = true permite agregar texto al final del archivo
        FileWriter writerMinus = new FileWriter("abecedario.txt", true);
        for(int i = 97; i <= 122; i++) {
            writerMinus.write(Character.toString(i));
            writerMinus.write("\n");
        }
        writerMinus.close();
    }
}
