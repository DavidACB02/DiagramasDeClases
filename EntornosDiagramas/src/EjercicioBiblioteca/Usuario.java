package EjercicioBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona {
    private List<String> librosPrestados;

    public Usuario(String nombre, String identificacion) {
        super(nombre, identificacion);
        this.librosPrestados = new ArrayList<>();
    }

    public void solicitarPrestamo(String libro) {
        librosPrestados.add(libro);
        System.out.println(nombre + " ha solicitado el préstamo del libro: " + libro);
    }

    public List<String> getLibrosPrestados() {
        return librosPrestados;
    }

    @Override
    public String toString() {
        return super.toString() + ", Libros Prestados: " + librosPrestados;
    }
}
