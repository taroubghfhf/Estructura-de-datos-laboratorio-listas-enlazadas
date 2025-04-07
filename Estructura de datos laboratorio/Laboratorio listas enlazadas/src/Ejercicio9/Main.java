package Ejercicio9;

public class Main {

    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);

        lista.mostrar();  // 10 -> 20 -> 30 -> (inicio)

        System.out.println("¿Está el 20? " + lista.buscar(20)); // true
        System.out.println("¿Está el 40? " + lista.buscar(40)); // false
    }
}
