package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        ListaDobleEnlazada lista = new ListaDobleEnlazada();

        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);

        System.out.println("Lista hacia adelante:");
        lista.imprimirHaciaAdelante();

        System.out.println("Lista hacia atrás:");
        lista.imprimirHaciaAtras();
    }
}
