class MiThread extends Thread {
    public void run() {
        System.out.println("Hola desde un thread!");
    }
}

public class ThreadEjemplo {
    public static void main(String[] args) {
        MiThread thread = new MiThread();
        thread.start(); // Inicia el thread
    }
}

