package Ejercicio7;

public class IteradorDoble {

    private NodoDoble actual;
    private boolean haciaAdelante;

    public IteradorDoble(NodoDoble inicio) {
        this(inicio, true); // por defecto hacia adelante
    }

    public IteradorDoble(NodoDoble inicio, boolean haciaAdelante) {
        this.actual = inicio;
        this.haciaAdelante = haciaAdelante;
    }

    public boolean hasNext() {
        return actual != null;
    }

    public int next() {
        int valor = actual.valor;
        actual = haciaAdelante ? actual.siguiente : actual.anterior;
        return valor;
    }
}
