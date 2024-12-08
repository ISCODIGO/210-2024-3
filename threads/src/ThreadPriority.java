public class ThreadPriority {
    public static void main(String[] args) {
        // Crear threads con diferentes prioridades
        Thread thread1 = new Thread(new Tarea(), "Thread 1");
        Thread thread2 = new Thread(new Tarea(), "Thread 2");
        Thread thread3 = new Thread(new Tarea(), "Thread 3");

        // Establecer prioridades
        thread1.setPriority(Thread.MIN_PRIORITY); // Prioridad mínima (1)
        thread2.setPriority(Thread.NORM_PRIORITY); // Prioridad normal (5)
        thread3.setPriority(Thread.MAX_PRIORITY); // Prioridad máxima (10)

        // Iniciar threads
        thread1.start();
        thread2.start();
        thread3.start();
    }

    // Clase que implementa una tarea simple
    static class Tarea implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Iteración " + i);
                try {
                    Thread.sleep(50); // Simula trabajo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

