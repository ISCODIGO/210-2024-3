package proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        List<Integer> lista1 = crearLista(1, 10_000);
        List<Integer> lista2 = crearLista(10_001, 20_000);

        long inicio = System.currentTimeMillis();

        // Crear un ExecutorService con un pool de 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Enviar las tareas al executor
        executor.execute(() -> procesarLista(lista1));
        executor.execute(() -> procesarLista(lista2));

        // Apagar el executor y esperar a que termine
        executor.shutdown();
        while (!executor.isTerminated()) {
            // Espera a que terminen todas las tareas
        }

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo total con Executor: " + (fin - inicio) + " ms");
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

