package vaso;

import java.util.Objects;

public class Vaso {
    private float capacidad;
    private float contenidoActual;

    public Vaso(float capacidad) {
        this.capacidad = capacidad;
        this.contenidoActual = 0;
    }

    public float getContenidoActual() {
        return contenidoActual;
    }

    public void setContenidoActual(float contenidoActual) {
        if (contenidoActual < 0 || contenidoActual > capacidad) {
            throw new IndexOutOfBoundsException("Contenido es erroneo");
        }
        this.contenidoActual = contenidoActual;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public boolean estaVacio() {
        return contenidoActual == 0;
    }

    public boolean estaLleno() {
        return capacidad == contenidoActual;
    }

    // Desde el punto de vista del objeto actual
    public void enviar(Vaso origen) {
        if (this.estaLleno()) {
            return;
        }

        if (origen.estaVacio()) {
            return;
        }

        if (origen.getContenidoActual() >= this.getCapacidad()) {
            // el destino queda lleno
            this.setContenidoActual(this.getCapacidad());
            // el origen se queda con la diferencia
            float diferencia = origen.getContenidoActual() - this.getCapacidad();
            origen.setContenidoActual(diferencia);
        } else {
            // el destino se queda con el liquido
            this.setContenidoActual(origen.getContenidoActual());
            // el origen se queda vacio
            origen.setContenidoActual(0);
        }
    }

    // Desde el punto de vista de la clase
    public static void transferir(Vaso origen, Vaso destino) {
        if (destino.estaLleno()) {
            return;
        }

        if (origen.estaVacio()) {
            return;
        }

        if (origen.getContenidoActual() >= destino.getCapacidad()) {
            // el destino queda lleno
            destino.setContenidoActual(destino.getCapacidad());
            // el origen se queda con la diferencia
            float diferencia = origen.getContenidoActual() - destino.getCapacidad();
            origen.setContenidoActual(diferencia);
        } else {
            // el destino se queda con el liquido
            destino.setContenidoActual(origen.getContenidoActual());
            // el origen se queda vacio
            origen.setContenidoActual(0);
        }
    }

    @Override
    public String toString() {
        return String.format("%.1fL de %.1fL", getContenidoActual(), getCapacidad());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  // Son el mismo objeto?
        if (o == null || getClass() != o.getClass()) return false;  // Ambos objetos pertenecen a la misma clase
        Vaso vaso = (Vaso) o;
        return Float.compare(capacidad, vaso.capacidad) == 0
                && Float.compare(contenidoActual, vaso.contenidoActual) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacidad, contenidoActual);
    }
}
