package EjercicioBiblioteca;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Alberto Barranco", "12345");
        usuario.solicitarPrestamo("El Quijote");

        Empleado empleado = new Empleado("David Cruz", "67890", 40);
        empleado.asignarTarea("Ordenar libros");

        Cuentacuentos cuentacuentos = new Cuentacuentos("Viernes 16:00");
        cuentacuentos.registrarParticipante("Roda");

        Libro libro = new Libro("Préstamo de Libro", new Date(), new Date(), "Cien años de soledad", "García Márquez");
        System.out.println(libro);
    }
}
