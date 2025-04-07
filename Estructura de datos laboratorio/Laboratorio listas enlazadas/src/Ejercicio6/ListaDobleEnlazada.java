package Ejercicio6;

public class ListaDobleEnlazada {
    private NodoDoble cabeza;
    private NodoDoble cola;

    // Agrega un nodo al final
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

    // Imprimir hacia atrás desde la cola
    public void imprimirHaciaAtras() {
        NodoDoble actual = cola;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.anterior;
        }
        System.out.println();
    }

    // Imprimir hacia adelante desde la cabeza (opcional para verificación)
    public void imprimirHaciaAdelante() {
        NodoDoble actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
