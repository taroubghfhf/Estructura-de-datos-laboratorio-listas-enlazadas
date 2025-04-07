package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        ListaDoblePersonas lista = new ListaDoblePersonas();

        lista.agregar(new Persona("Ana", "123456"));
        lista.agregar(new Persona("Luis", "78901"));
        lista.agregar(new Persona("Sofía", "98765432"));
        lista.agregar(new Persona("Carlos", "112233"));

        System.out.println("Lista original:");
        lista.imprimir();

        ListaDoblePersonas cedulasPares = lista.obtenerCedulasConDigitosPares();

        System.out.println("\nPersonas con cédulas de longitud par:");
        cedulasPares.imprimir();
    }
}
