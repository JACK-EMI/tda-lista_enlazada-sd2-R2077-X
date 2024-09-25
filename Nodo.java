public class Nodo<T> {
    private T dato;
    private Nodo<T> enlaceSiguiente;
    private Nodo<T> enlaceAnterior;

    public Nodo() {
        dato = null; // Inicializa el dato como null
        enlaceSiguiente = null;
        enlaceAnterior = null;
    }

    public Nodo(T dato) {
        this.dato = dato;
        enlaceSiguiente = null;
        enlaceAnterior = null;
    }

    public Nodo(T dato, Nodo<T> enlaceSiguiente) {
        this.dato = dato;
        this.enlaceSiguiente = enlaceSiguiente;
        this.enlaceAnterior = null;
    }

    public Nodo(T dato, Nodo<T> enlaceSiguiente, Nodo<T> enlaceAnterior) {
        this.dato = dato;
        this.enlaceSiguiente = enlaceSiguiente;
        this.enlaceAnterior = enlaceAnterior;
    }

    public Nodo<T> getEnlace() {
        return enlaceSiguiente;
    }

    public void setEnlace(Nodo<T> enlaceSiguiente) {
        this.enlaceSiguiente = enlaceSiguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Nodo [dato=" + dato + ", enlaceSiguiente=" + enlaceSiguiente + "]";
    }

    public Nodo<T> getEnlaceSiguiente() {
        return enlaceSiguiente;
    }

    public void setEnlaceSiguiente(Nodo<T> enlaceSiguiente) {
        this.enlaceSiguiente = enlaceSiguiente;
    }

    public Nodo<T> getEnlaceAnterior() {
        return enlaceAnterior;
    }

    public void setEnlaceAnterior(Nodo<T> enlaceAnterior) {
        this.enlaceAnterior = enlaceAnterior;
    }
}
