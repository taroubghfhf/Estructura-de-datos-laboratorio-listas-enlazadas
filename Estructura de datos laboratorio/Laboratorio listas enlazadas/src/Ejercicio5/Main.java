package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.agregar(3);
        lista.agregar(7);
        lista.agregar(3);
        lista.agregar(5);
        lista.agregar(3);
        lista.agregar(9);

        System.out.println("Lista:");
        lista.mostrar();

        int valorBuscado = 3;
        int repeticiones = lista.contarRepeticiones(valorBuscado);

        System.out.println("El número " + valorBuscado + " se repite " + repeticiones + " veces.");
    }
}
