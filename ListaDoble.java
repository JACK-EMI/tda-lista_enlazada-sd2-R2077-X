public class ListaDoble implements ILista {

    private Nodo cabeza;
    private Nodo cola;

    public ListaDoble(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public ListaDoble(Nodo cabeza, Nodo cola) {
        this.cabeza = cabeza;
        this.cola = cola;
    }

    @Override
    public void inicializacionoCreacion() {

    }

    @Override
    public void insertarElemento(String elementoaInsertar) {
        Nodo nuevoNodo = new Nodo(); // se crea un nodo vacio
        nuevoNodo.setDato(elementoaInsertar); // se agrega el dato al nuevo nodo
        nuevoNodo.setEnlaceSiguiente(cabeza); // el enlace del nuevo nodo es la cabeza
        cabeza = nuevoNodo; // la cabeza es el nuevo nodo
        if (cola == null) {
            cola = nuevoNodo;
        }
    }

    @Override
    public void eliminarElemento(String elementoaEliminar) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarElemento'");
    }

    @Override
    public void pop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }

    @Override
    public Nodo buscarElemento(String elementoaBuscar) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarElemento'");
    }

    @Override
    public boolean seEncuentraElemento(String elementoaEncontrar) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'seEncuentraElemento'");
    }

    @Override
    public String recorrerLista() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recorrerLista'");
    }

    @Override
    public boolean estaVacia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'estaVacia'");
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getCola() {
        return cola;
    }

    public void setCola(Nodo cola) {
        this.cola = cola;
    }

}
