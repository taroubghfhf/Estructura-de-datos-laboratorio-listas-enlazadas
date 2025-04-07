package Ejercicio10;

public class Lista {
    private Nodo cabeza;

    public Lista() {
        cabeza = null;
    }

    public void insertarAlFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
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

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    // Método estático para concatenar dos listas
    public static Lista concatenar(Lista l1, Lista l2) {
        Lista resultado = new Lista();

        // Si l1 está vacía, devolver l2
        if (l1.getCabeza() == null) {
            resultado.setCabeza(l2.getCabeza());
            return resultado;
        }

        // Si l2 está vacía, devolver l1
        if (l2.getCabeza() == null) {
            resultado.setCabeza(l1.getCabeza());
            return resultado;
        }

        // Clonar l1
        Nodo actual = l1.getCabeza();
        while (actual != null) {
            resultado.insertarAlFinal(actual.dato);
            actual = actual.siguiente;
        }

        // Clonar l2
        actual = l2.getCabeza();
        while (actual != null) {
            resultado.insertarAlFinal(actual.dato);
            actual = actual.siguiente;
        }

        return resultado;
    }


}
