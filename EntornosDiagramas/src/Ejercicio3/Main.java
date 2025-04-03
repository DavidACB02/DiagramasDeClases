package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Creando una instancia de Persona (David) con un coche
        Persona david = new Persona(true);
        Cars cocheDeDavid = new Cars("Toyota", "Corolla", 2022, "Rojo", 180);

        david.asignarCoche(cocheDeDavid);

        if (david.getCoche() != null) {
            david.getCoche().acelerar(20);
            david.getCoche().frenar(10);
            david.getCoche().pintar("Azul");
            System.out.println(david.getCoche());
        } else {
            System.out.println("David no tiene un coche asignado.");
        }
    }
}
