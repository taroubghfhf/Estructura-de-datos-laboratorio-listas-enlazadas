package Ejercicio5;

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

    // Método que cuenta cuántas veces se repite un valor
    public int contarRepeticiones(int valorBuscado) {
        int contador = 0;
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.valor == valorBuscado) {
                contador++;
            }
            actual = actual.siguiente;
        }

        return contador;
    }

    // Muestra la lista
    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
