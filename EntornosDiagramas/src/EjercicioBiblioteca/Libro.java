package EjercicioBiblioteca;

import java.util.Date;

public class Libro extends Prestamo {
    private String titulo;
    private String autor;

    public Libro(String descripcion, Date fechaPrestamo, Date fechaDevolucion, String titulo, String autor) {
        super(descripcion, fechaPrestamo, fechaDevolucion);
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Título: " + titulo + ", Autor: " + autor;
    }
}
