package EjercicioBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Cuentacuentos {
    private String horario;
    private List<String> participantes;

    public Cuentacuentos(String horario) {
        this.horario = horario;
        this.participantes = new ArrayList<>();
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void registrarParticipante(String nombre) {
        participantes.add(nombre);
        System.out.println(nombre + " ha sido registrado en el cuentacuentos.");
    }

    public List<String> getParticipantes() {
        return participantes;
    }

    @Override
    public String toString() {
        return "Cuentacuentos en horario: " + horario + ", Participantes: " + participantes;
    }
}
