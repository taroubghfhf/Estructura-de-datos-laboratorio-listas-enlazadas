package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        ListaEnlazadaPersonas lista = new ListaEnlazadaPersonas();

        lista.agregar("Ana", "12345678");
        lista.agregar("Luis", "987654321");
        lista.agregar("Marta", "45671234");
        lista.agregar("Pedro", "1234567");

        System.out.println("Personas con cédula de cantidad PAR de dígitos:");
        lista.mostrarPersonasCedulaPar();
    }
}
