package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        ListaDobleEnlazada lista = new ListaDobleEnlazada();
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);

        System.out.println("Recorriendo hacia adelante:");
        IteradorDoble itAdelante = lista.iteradorAdelante();
        while (itAdelante.hasNext()) {
            System.out.print(itAdelante.next() + " ");
        }

        System.out.println("\nRecorriendo hacia atrás:");
        IteradorDoble itAtras = lista.iteradorAtras();
        while (itAtras.hasNext()) {
            System.out.print(itAtras.next() + " ");
        }
    }
}
