package Ejercicio7;

public class ListaDobleEnlazada {

    private NodoDoble cabeza;
    private NodoDoble cola;

    public void agregar(int valor) {
        NodoDoble nuevo = new NodoDoble(valor);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    public NodoDoble getCabeza() {
        return cabeza;
    }

    public NodoDoble getCola() {
        return cola;
    }

    // Crear iterador hacia adelante desde la cabeza
    public IteradorDoble iteradorAdelante() {
        return new IteradorDoble(cabeza);
    }

    // Crear iterador hacia atrás desde la cola (opcional)
    public IteradorDoble iteradorAtras() {
        return new IteradorDoble(cola, false);
    }
}
