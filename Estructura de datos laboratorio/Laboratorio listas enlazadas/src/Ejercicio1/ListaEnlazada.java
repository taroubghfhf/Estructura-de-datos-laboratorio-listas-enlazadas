package Ejercicio1;

public class ListaEnlazada {
    static class Nodo {
        int valor;
        Nodo siguiente;

        Nodo(int valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    }

    Nodo cabeza;

    // Agregar un nuevo nodo al final
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

    // Mostrar solo los valores en posiciones impares
    public void mostrarImpares() {
        Nodo actual = cabeza;
        int posicion = 0;
        while (actual != null) {
            if (posicion % 2 != 0) {
                System.out.println("Posición " + posicion + ": " + actual.valor);
            }
            actual = actual.siguiente;
            posicion++;
        }
    }

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        // Agregamos algunos valores
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);
        lista.agregar(50);

        System.out.println("Valores en posiciones impares:");
        lista.mostrarImpares();
    }

}