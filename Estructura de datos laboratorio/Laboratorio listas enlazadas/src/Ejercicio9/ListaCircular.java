package Ejercicio9;

public class ListaCircular {
    private Nodo ultimo;

    public ListaCircular() {
        ultimo = null;
    }

    // Método insertar (al final de la lista)
    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (ultimo == null) {
            // Lista vacía: el nuevo nodo se apunta a sí mismo
            ultimo = nuevo;
            ultimo.siguiente = ultimo;
        } else {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    // Método buscar
    public boolean buscar(int dato) {
        if (ultimo == null) {
            return false;
        }

        Nodo actual = ultimo.siguiente; // Empezamos desde el primero
        do {
            if (actual.dato == dato) {
                return true;
            }
            actual = actual.siguiente;
        } while (actual != ultimo.siguiente); // Volvemos al inicio

        return false;
    }

    // Método para mostrar la lista (opcional, para pruebas)
    public void mostrar() {
        if (ultimo == null) {
            System.out.println("Lista vacía");
            return;
        }

        Nodo actual = ultimo.siguiente;
        do {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        } while (actual != ultimo.siguiente);
        System.out.println("(inicio)");
    }
}
