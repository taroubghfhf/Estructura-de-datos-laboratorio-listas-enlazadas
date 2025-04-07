package Ejercicio4;

public class ListaEnlazada {
    private Nodo cabeza;

    // Agrega un número al final de la lista
    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Devuelve una nueva lista enlazada con los valores impares
    public ListaEnlazada obtenerImpares() {
        ListaEnlazada impares = new ListaEnlazada();
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.valor % 2 != 0) {
                impares.agregar(actual.valor);
            }
            actual = actual.siguiente;
        }

        return impares;
    }

    // Muestra los elementos de la lista
    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
