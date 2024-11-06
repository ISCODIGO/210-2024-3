package todolist;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaTarea lista = new ListaTarea(10);
        Scanner entrada = new Scanner(System.in);

        while(true) {
            System.out.println("--------");
            System.out.println(" Tareas ");
            System.out.println("--------");
            System.out.println("[0] Salir");
            System.out.println("[1] Agregar");
            System.out.println("[2] Listar");
            System.out.println("[3] Buscar");
            System.out.println("[4] Completar");
            System.out.print("Escriba una opcion: ");
            String opcion = entrada.nextLine();

            switch (opcion) {
                case "0" -> System.exit(0);
                case "1" -> {
                    System.out.print("Escriba un titulo: ");
                    String titulo = entrada.nextLine();
                    System.out.print("Escriba una descripcion: ");
                    String descripcion = entrada.nextLine();

                    Tarea nueva = new Tarea(titulo, descripcion);
                    lista.agregar(nueva);
                }
                case "2" -> {
                    System.out.println("-----------------------");
                    System.out.println(lista);
                }
                case "3" -> {
                    System.out.print("Escriba una frase a buscar: ");
                    String frase = entrada.nextLine();
                    Tarea tarea = lista.buscar(frase);
                    if (tarea != null) {
                        System.out.println(tarea);
                    } else {
                        System.out.println("** No existe la tarea **");
                    }
                }
                case "4" -> {
                    System.out.print("Escriba una frase a buscar: ");
                    String frase = entrada.nextLine();
                    Tarea tarea = lista.buscar(frase);
                    if (tarea != null) {
                        tarea.setTerminado(true);
                    } else {
                        System.out.println("** No existe la tarea **");
                    }

                }
                default -> System.out.println("** Opcion invalida **");
            }
        }
    }
}