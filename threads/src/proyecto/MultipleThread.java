package proyecto;

import java.util.ArrayList;
import java.util.List;

public class MultipleThread {
    public static void main(String[] args) {
        List<Integer> lista1 = crearLista(1, 10_000);
        List<Integer> lista2 = crearLista(10_001, 20_000);

        long inicio = System.currentTimeMillis();

        // Crear threads para procesar ambas listas en paralelo
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                procesarLista(lista1);
            }
        });
        Thread thread2 = new Thread(() -> procesarLista(lista2));

        // Iniciar los threads
        thread1.start();
        thread2.start();

        // Esperar a que ambos threads terminen
        try {
            thread1.join();
            //thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo total con multi-thread: " + (fin - inicio) + " ms");
    }

    private static void procesarLista(List<Integer> lista) {
        for (int num : lista) {
            Math.pow(num, 2); // Calcula el cuadrado (tarea simulada)
        }
    }

    private static List<Integer> crearLista(int inicio, int fin) {
        List<Integer> lista = new ArrayList<>();
        for (int i = inicio; i <= fin; i++) {
            lista.add(i);
        }
        return lista;
    }
}
