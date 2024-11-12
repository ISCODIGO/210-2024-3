package vaso;

public class Main {
    public static void main(String[] args) {
        Vaso v1 = new Vaso(10);
        Vaso v2 = new Vaso(30);

        v2.setContenidoActual(15);

        Vaso.transferir(v2, v1);
        System.out.println("Vaso 1: " + v1);
        System.out.println("Vaso 2: " + v2);

        Vaso v3 = new Vaso(10);

        System.out.println("Son iguales: " + v1.equals(v3));
        System.out.println("Vaso 3 se llena con 10L");
        v3.setContenidoActual(10);
        System.out.println("Son iguales: " + v1.equals(v3));

    }
}
