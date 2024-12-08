class Contador extends Thread {
    private String nombre;

    public Contador(String nombre) {
        this.nombre = nombre;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(nombre + ": " + i);
            try {
                Thread.sleep(500); // Pausa de 500 ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrumpido.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Contador thread1 = new Contador("Thread 1");
        Contador thread2 = new Contador("Thread 2");
        Contador thread3 = new Contador("Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

