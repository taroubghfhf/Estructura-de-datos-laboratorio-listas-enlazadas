package Ejercicio11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Polinomio poli = new Polinomio();

        System.out.print("¿Cuántos términos tendrá el polinomio? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Coeficiente del término " + i + ": ");
            double coef = sc.nextDouble();

            System.out.print("Exponente del término " + i + ": ");
            int exp = sc.nextInt();

            poli.agregarTermino(coef, exp);
        }

        System.out.println("\nTabla de valores del polinomio:");
        poli.mostrarTablaValores();

        sc.close();
    }

}
