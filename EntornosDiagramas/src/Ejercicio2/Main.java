package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Pez pez = new Pez();
        pez.respirar();
        pez.nadar();

        Perro perro = new Perro();
        perro.respirar();
        perro.ladrar();

        Gato gato = new Gato();
        gato.respirar();
        gato.maullar();
    }
}
