package ejemplo1.lunes;

// Dominio: tgu.is.unah.edu.hn
// Package: hn.edu.unah.is.tgu

// Libreria por defecto: java.lang


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PrimerPrograma {
    public static void main(String[] args) {
        boolean b = true;
        // enteros
        byte by = 100;
        short sh = 10;
        int in = 10;
        long lo = 4_000_000_000L;

        // caracter
        char c = 'a';
        char c2 = 64;

        System.out.println(c2);

        // flotantes
        float fl = 34.5F;
        double db = 456.6;

        // conversiones
        byte mibyte = 45;
        long unlong = mibyte;

        float f1 = unlong;

        // conversiones explicita (casting)
        long otrolong = 129;
        byte b11 = (byte)otrolong;
        System.out.println(b11);

        float pi = (float)3.14159;
        int piEntero = (int) pi;
        System.out.println(piEntero);
    }
}