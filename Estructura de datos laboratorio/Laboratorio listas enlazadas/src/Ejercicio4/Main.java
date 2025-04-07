package Ejercicio4;

public class Main {

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.agregar(5);
        lista.agregar(12);
        lista.agregar(7);
        lista.agregar(20);
        lista.agregar(3);

        System.out.println("Lista original:");
        lista.mostrar();

        ListaEnlazada impares = lista.obtenerImpares();
        System.out.println("Lista de valores impares:");
        impares.mostrar();
    }
}
