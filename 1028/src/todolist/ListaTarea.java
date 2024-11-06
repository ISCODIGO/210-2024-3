package todolist;

public class ListaTarea {
    private Tarea[] tareas;
    private int size;

    public ListaTarea(int capacidad) {
        this.tareas = new Tarea[capacidad];
        this.size = 0;
    }

    public void agregar(Tarea tarea) {
        if (size >= tareas.length) {
            System.out.println("Capacidad excedida...");
            return;
        }
        this.tareas[size++] = tarea;
    }

    public Tarea buscar(String palabra) {
        for(int i = 0; i < getSize(); i++) {
            if (tareas[i].getTitulo().equalsIgnoreCase(palabra)) {
                return tareas[i];
            }
        }
        return null;
    }

    public boolean completar(String palabra) {
        Tarea tarea = buscar(palabra);

        if (tarea != null) {
            tarea.setTerminado(true);
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder salida = new StringBuilder();

        for (int i = 0; i < size; i++) {
            salida.append(tareas[i]);
            salida.append("\n");
        }

        return salida.toString();
    }
}
