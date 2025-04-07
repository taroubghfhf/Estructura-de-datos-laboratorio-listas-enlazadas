package Ejercicio8;

public class Persona {
    String nombre;
    String cedula;

    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return nombre + " - " + cedula;
    }

}
