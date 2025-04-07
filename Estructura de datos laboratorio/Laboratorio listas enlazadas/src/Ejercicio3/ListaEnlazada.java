package Ejercicio3;

public class ListaEnlazada {
    private Nodo cabeza;

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

    public void eliminarPares() {
        // Eliminar nodos pares desde el inicio
        while (cabeza != null && cabeza.valor % 2 == 0) {
            cabeza = cabeza.siguiente;
        }

        Nodo actual = cabeza;

        while (actual != null && actual.siguiente != null) {
            if (actual.siguiente.valor % 2 == 0) {
                actual.siguiente = actual.siguiente.siguiente;
            } else {
                actual = actual.siguiente;
            }
        }
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
