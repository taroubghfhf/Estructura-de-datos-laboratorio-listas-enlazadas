package Ejercicio11;

public class Termino {
    double coeficiente;
    int exponente;
    Termino siguiente;

    public Termino(double coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
        this.siguiente = null;
    }
}
