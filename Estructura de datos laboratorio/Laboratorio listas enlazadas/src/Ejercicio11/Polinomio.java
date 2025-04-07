package Ejercicio11;
import java.util.Scanner;
public class Polinomio {
    private Termino cabeza;

    public Polinomio() {
        cabeza = null;
    }

    // Agrega términos al final de la lista
    public void agregarTermino(double coeficiente, int exponente) {
        Termino nuevo = new Termino(coeficiente, exponente);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Termino actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Evalúa el polinomio en un valor de x
    public double evaluar(double x) {
        double resultado = 0;
        Termino actual = cabeza;
        while (actual != null) {
            resultado += actual.coeficiente * Math.pow(x, actual.exponente);
            actual = actual.siguiente;
        }
        return resultado;
    }

    // Imprime la tabla de valores del polinomio para x = 0.0 hasta 5.0
    public void mostrarTablaValores() {
        System.out.println(" x\t|\tP(x)");
        System.out.println("---------------------------");
        for (double x = 0.0; x <= 5.0; x += 0.5) {
            System.out.printf("%.1f\t|\t%.4f\n", x, evaluar(x));
        }
    }
}
