package EjercicioBiblioteca;

import java.util.Date;

public class Prestamo extends Servicio {
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public Prestamo(String descripcion, Date fechaPrestamo, Date fechaDevolucion) {
        super(descripcion);
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fecha Préstamo: " + fechaPrestamo + ", Fecha Devolución: " + fechaDevolucion;
    }
}
