package Ejercicio2;

public class ListaEnlazadaPersonas {

    private Nodo cabeza;

    public void agregar(String nombre, String cedula) {
        Persona nueva = new Persona(nombre, cedula);
        Nodo nodo = new Nodo(nueva);

        if (cabeza == null) {
            cabeza = nodo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nodo);
        }
    }

    public void mostrarPersonasCedulaPar() {
        Nodo actual = cabeza;

        while (actual != null) {
            Persona p = actual.getPersona();
            int longitud = p.getCedula().length();

            if (longitud % 2 == 0) {
                System.out.println(p.getNombre() + " - Cédula: " + p.getCedula());
            }

            actual = actual.getSiguiente();
        }
    }
}
