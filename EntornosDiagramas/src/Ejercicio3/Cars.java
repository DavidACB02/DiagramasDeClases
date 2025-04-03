package Ejercicio3;

public class Cars {
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private int velocidadMaxima;

    public Cars(String marca, String modelo, int anio, String color, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(int incremento) {
        System.out.println("El coche ha acelerado en " + incremento + " km/h.");
    }

    public void frenar(int decremento) {
        System.out.println("El coche ha frenado en " + decremento + " km/h.");
    }

    public void pintar(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println("El coche ha sido pintado de color " + nuevoColor);
    }

    @Override
    public String toString() {
        return "Coche: " + marca + " " + modelo + ", Año: " + anio + ", Color: " + color + ", Velocidad Máxima: " + velocidadMaxima + " km/h.";
    }
}
