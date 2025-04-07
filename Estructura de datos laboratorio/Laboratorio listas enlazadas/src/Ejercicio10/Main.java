package Ejercicio10;

public class Main {
    public static void main(String[] args) {
        Lista lista1 = new Lista();
        lista1.insertarAlFinal(1);
        lista1.insertarAlFinal(2);
        lista1.insertarAlFinal(3);

        Lista lista2 = new Lista();
        lista2.insertarAlFinal(4);
        lista2.insertarAlFinal(5);

        System.out.println("Lista 1:");
        lista1.mostrar();

        System.out.println("Lista 2:");
        lista2.mostrar();

        Lista listaConcatenada = Lista.concatenar(lista1, lista2);
        System.out.println("Lista concatenada:");
        listaConcatenada.mostrar();
    }
}
