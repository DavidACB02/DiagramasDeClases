package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Creando una instancia de Persona con el nombre "David"
        Persona david = new Persona("David", 30, "Calle Falsa 123", "123456789", "david@lope.com");

        System.out.println("Nombre: " + david.getNombre());
        System.out.println("Edad: " + david.getEdad());
        System.out.println("Dirección: " + david.getDireccion());
        System.out.println("Teléfono: " + david.getTelefono());
        System.out.println("Correo: " + david.getCorreo());
    }
}
