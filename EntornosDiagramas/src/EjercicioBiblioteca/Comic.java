package EjercicioBiblioteca;

import java.util.Date;

public class Comic extends Prestamo {
    private String titulo;
    private String ilustrador;

    public Comic(String descripcion, Date fechaPrestamo, Date fechaDevolucion, String titulo, String ilustrador) {
        super(descripcion, fechaPrestamo, fechaDevolucion);
        this.titulo = titulo;
        this.ilustrador = ilustrador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIlustrador() {
        return ilustrador;
    }

    public void setIlustrador(String ilustrador) {
        this.ilustrador = ilustrador;
    }

    @Override
    public String toString() {
        return super.toString() + ", Título: " + titulo + ", Ilustrador: " + ilustrador;
    }
}
