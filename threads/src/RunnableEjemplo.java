class MiRunnable implements Runnable {
    public void run() {
        System.out.println("Hola desde un thread con Runnable!");
    }
}

public class RunnableEjemplo {
    public static void main(String[] args) {
        Thread thread = new Thread(new MiRunnable());
        thread.start(); // Inicia el thread
    }
}
