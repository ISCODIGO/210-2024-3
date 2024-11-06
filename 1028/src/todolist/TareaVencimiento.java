package todolist;

import java.time.LocalDate;

public class TareaVencimiento extends Tarea {
    public TareaVencimiento(String t, String d, LocalDate fechaVencimiento) {
        super(t, d);  // Constructor de Tarea
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + this.fechaVencimiento;
    }

    private LocalDate fechaVencimiento;

    public static void main(String[] args) {
        TareaVencimiento tv = new TareaVencimiento(
                "Examen 2.1",
                "Examen de programacion II",
                LocalDate.of(2024, 11, 8)
        );

        System.out.println(tv);

        ListaTarea listaTarea = new ListaTarea(10);
        listaTarea.agregar(tv);
        listaTarea.agregar(new Tarea("hola", "esto es un saludo"));
        System.out.println("Esta es la lista");
        System.out.println(listaTarea);

    }
}
