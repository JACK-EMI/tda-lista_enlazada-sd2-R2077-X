public class Nodo {
    private String dato;
    private Nodo enlaceSiguiente;
    private Nodo enlaceAnterior;

    public Nodo() {
        dato = null;
        enlaceSiguiente = null;
    }

    public Nodo(String dato) {
        this.dato = dato;
        enlaceSiguiente = null;
    }

    public Nodo(String dato, Nodo enlaceSiguiente) {
        this.dato = dato;
        this.enlaceSiguiente = enlaceSiguiente;
    }

    public Nodo(String dato, Nodo enlaceSiguiente, Nodo enlaceAnterior) {
        this.dato = dato;
        this.enlaceSiguiente = enlaceSiguiente;
        this.enlaceAnterior = enlaceAnterior;
    }

    public Nodo getEnlace() {
        return enlaceSiguiente;
    }

    public void setEnlace(Nodo enlaceSiguiente) {
        this.enlaceSiguiente = enlaceSiguiente;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String elementoaInsertar) {
        this.dato = elementoaInsertar;
    }

    @Override
    public String toString() {
        return "Nodo [dato=" + dato + ", enlaceSiguiente=" + enlaceSiguiente + "]";
    }

    public Nodo getEnlaceSiguiente() {
        return enlaceSiguiente;
    }

    public void setEnlaceSiguiente(Nodo enlaceSiguiente) {
        this.enlaceSiguiente = enlaceSiguiente;
    }

    public Nodo getEnlaceAnterior() {
        return enlaceAnterior;
    }

    public void setEnlaceAnterior(Nodo enlaceAnterior) {
        this.enlaceAnterior = enlaceAnterior;
    }

}