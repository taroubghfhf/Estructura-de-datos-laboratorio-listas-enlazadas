package Ejercicio8;

public class ListaDoblePersonas {

    private NodoDoblePersona cabeza;
    private NodoDoblePersona cola;

    public void agregar(Persona persona) {
        NodoDoblePersona nuevo = new NodoDoblePersona(persona);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    // Método para obtener nueva lista con personas cuya cédula tenga longitud par
    public ListaDoblePersonas obtenerCedulasConDigitosPares() {
        ListaDoblePersonas resultado = new ListaDoblePersonas();
        NodoDoblePersona actual = cabeza;

        while (actual != null) {
            if (actual.persona.cedula.length() % 2 == 0) {
                resultado.agregar(actual.persona);
            }
            actual = actual.siguiente;
        }

        return resultado;
    }

    public void imprimir() {
        NodoDoblePersona actual = cabeza;
        while (actual != null) {
            System.out.println(actual.persona);
            actual = actual.siguiente;
        }
    }
}
