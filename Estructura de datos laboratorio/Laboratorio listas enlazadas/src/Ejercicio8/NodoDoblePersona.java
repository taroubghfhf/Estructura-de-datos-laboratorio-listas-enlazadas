package Ejercicio8;

public class NodoDoblePersona {
    Persona persona;
    NodoDoblePersona siguiente;
    NodoDoblePersona anterior;

    public NodoDoblePersona(Persona persona) {
        this.persona = persona;
        this.siguiente = null;
        this.anterior = null;
    }
}
