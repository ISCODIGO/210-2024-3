package todolist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaTarea lista = new ListaTarea(10);


        while(true) {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Escriba un titulo: ");
            String titulo = entrada.nextLine();
            System.out.print("Escriba una descripcion: ");
            String descripcion = entrada.nextLine();

            Tarea nueva = new Tarea(titulo, descripcion);
            lista.agregar(nueva);
            System.out.println(lista);
        }
    }
}