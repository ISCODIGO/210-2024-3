public class SwitchDemo {
    public static void ejemplo(int day) {
        // Ejemplo de switch
        switch (day) {
            case 1 -> System.out.println("Hoy es Lunes");
            case 2 -> System.out.println("Hoy es Martes");
            case 3 -> System.out.println("Hoy es Miércoles");
            case 4 -> System.out.println("Hoy es Jueves");
            case 5 -> System.out.println("Hoy es Viernes");
            case 6 -> System.out.println("Hoy es Sábado");
            case 7 -> System.out.println("Hoy es Domingo");
            default -> System.out.println("Día inválido");
        }

        // Asignacion por medio de switch
        String dayName = switch (day) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día inválido";
        };

        System.out.println("El día seleccionado es: " + dayName);
    }
    public static void main(String[] args) {
        int day = 3;

        ejemplo(day);

    }
}
