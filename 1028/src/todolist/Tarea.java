package todolist;

public class Tarea {
    // Datos / atributos
    private boolean terminado;
    private String titulo;
    private String descripcion;

    // Funciones / Metodos
    // 1. Constructor
    // No tiene retorno (ni siquiera void)
    // Se llama igual que la clase
    public Tarea(String t, String d) {
        setTitulo(t);
        setDescripcion(d);
        setTerminado(false);
    }

    public Tarea() {
        this("demo", "Esto es una prueba");
    }

    // 2. Funciones auxiliares

    @Override
    public String toString() {
        String estado = "";

        if (terminado) {
            estado = "[x]";
        } else {
            estado = "[ ]";
        }
        return String.format("%s %s: %s", estado, titulo, descripcion);
    }

    // 3. Mutador / Setter (escritura)
    // Deberia iniciar con el prefijo set + nombre de atributo
    // El retorno void
    // Por lo general, tienen un parametros de entrada
    public void setTerminado(boolean t) {
        terminado = t;
    }

    // 4. Acceso / Getter (lectura)
    // Inicia con get + nombre de atributo
    // Retorno es igual que el tipo del atributo
    // No tiene parametros de entrada
    public boolean getTerminado() {
        return terminado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.isEmpty()) {
            throw new IllegalArgumentException("Titulo no disponible");
        }
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
