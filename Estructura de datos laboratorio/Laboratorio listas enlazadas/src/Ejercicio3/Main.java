package Ejercicio3;

public class Main {

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.agregar(10);
        lista.agregar(15);
        lista.agregar(22);
        lista.agregar(33);
        lista.agregar(40);

        System.out.println("Lista original:");
        lista.mostrar();

        lista.eliminarPares();

        System.out.println("Lista después de eliminar los pares:");
        lista.mostrar();
    }
}
