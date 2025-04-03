package EjercicioBiblioteca;

public class Empleado extends Persona {
    private int horasTrabajo;

    public Empleado(String nombre, String identificacion, int horasTrabajo) {
        super(nombre, identificacion);
        this.horasTrabajo = horasTrabajo;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public void asignarTarea(String tarea) {
        System.out.println(nombre + " ha sido asignado a la tarea: " + tarea);
    }

    @Override
    public String toString() {
        return super.toString() + ", Horas de Trabajo: " + horasTrabajo;
    }
}
