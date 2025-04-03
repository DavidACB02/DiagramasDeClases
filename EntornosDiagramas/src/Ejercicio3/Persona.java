package Ejercicio3;

public class Persona {
    private boolean poseedorCoche;
    private Cars coche; 

    public Persona(boolean poseedorCoche) {
        this.poseedorCoche = poseedorCoche;
    }

    public boolean isPoseedorCoche() {
        return poseedorCoche;
    }

    public void setPoseedorCoche(boolean poseedorCoche) {
        this.poseedorCoche = poseedorCoche;
    }

    public void asignarCoche(Cars coche) {
        this.coche = coche;
        System.out.println("El coche ha sido asignado a la persona.");
    }

    public Cars getCoche() {
        return coche;
    }
}
