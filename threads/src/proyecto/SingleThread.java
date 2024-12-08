package proyecto;

import java.util.ArrayList;
import java.util.List;

public class SingleThread {
    public static void main(String[] args) {
        List<Integer> lista1 = crearLista(1, 10_000);
        List<Integer> lista2 = crearLista(10_001, 20_000);

        long inicio = System.currentTimeMillis();

        // Procesar lista 1
        procesarLista(lista1);

        // Procesar lista 2
        procesarLista(lista2);

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo total con single-thread: " + (fin - inicio) + " ms");
    }

    // Simula una tarea pesada procesando cada elemento de la lista
    private static void procesarLista(List<Integer> lista) {
        for (int num : lista) {
            Math.pow(num, 2); // Calcula el cuadrado (tarea simulada)
        }
    }

    // Crea una lista de números enteros en un rango
    private static List<Integer> crearLista(int inicio, int fin) {
        List<Integer> lista = new ArrayList<>();
        for (int i = inicio; i <= fin; i++) {
            lista.add(i);
        }
        return lista;
    }
}
