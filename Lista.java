public class Lista implements ILista {
    private Nodo cabeza;

    public Lista() {
        cabeza = null;
    }

    public Lista(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    @Override
    public void inicializacionoCreacion() {

    }

    @Override
    public Nodo buscarElemento(String elementoaBuscar) {
        if (estaVacia()) {
            System.out.println("No se puede buscar un elemento en la lista, ya que esta vacia.");
            return null;
        }
        Nodo auxNodo = cabeza;
        while (auxNodo != null) {
            if (auxNodo.getDato() == elementoaBuscar) {
                return auxNodo;
            }
            auxNodo = auxNodo.getEnlace();
        }
        return null;
    }

    @Override
    public void eliminarElemento(String elementoaEliminar) {
        if (estaVacia()) {
            System.out.println(":( No se puede eliminar: " + elementoaEliminar + ", la lista esta vacia.");
            return;
        }
        if (cabeza.getDato().equals(elementoaEliminar)) {
            cabeza = cabeza.getEnlace();
            System.out.println(":) Elemento: " + elementoaEliminar + ", eliminado de la lista");
            return;
        }
        Nodo auxNodo = cabeza;
        while (auxNodo.getEnlace() != null) {
            if (auxNodo.getEnlace().getDato().equals(elementoaEliminar)) {
                auxNodo.setEnlace(auxNodo.getEnlace().getEnlace());
                System.out.println(":) Elemento: " + elementoaEliminar + ", eliminado de la lista");
                return;
            }
            auxNodo = auxNodo.getEnlace();
        }
        System.out.println(":( El elemento: " + elementoaEliminar + ", no se encuentra en la lista");
    }

    @Override
    public boolean estaVacia() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Lista [cabeza=" + cabeza + "]";
    }

    @Override
    public void insertarElemento(String elementoaInsertar) {
        Nodo nuevoNodo = new Nodo(); // se crea un nodo vacio
        nuevoNodo.setDato(elementoaInsertar); // se agrega el dato al nuevo nodo
        nuevoNodo.setEnlace(cabeza); // el enlace del nuevo nodo es la cabeza
        cabeza = nuevoNodo; // la cabeza es el nuevo nodo
    }

    @Override
    public String recorrerLista() {
        String recorridoString = "";
        if (estaVacia()) {
            return "No se puede recorrer la lista, ya que esta vacia.";
        }
        Nodo auxNodo = cabeza;
        while (auxNodo != null) {
            recorridoString = recorridoString + auxNodo.getDato() + " ";
            auxNodo = auxNodo.getEnlace();
        }
        return recorridoString;
    }

    @Override
    public boolean seEncuentraElemento(String elementoaEncontrar) {
        if (estaVacia()) {
            System.out.println("No se puede determinar si se encuentra un elemento en la lista, ya que esta vacia.");
            return false;
        }
        Nodo auxNodo = cabeza;
        while (auxNodo != null) {
            if (auxNodo.getDato().equals(elementoaEncontrar)) {
                return true;
            }
            auxNodo = auxNodo.getEnlace();
        }
        return false;
    }

    @Override
    public void pop() {
        if (estaVacia()) {
            System.out.println("No se puede realizar el pop, ya que se encuentra vacia");
        } else {
            Nodo aux = cabeza;
            cabeza = aux.getEnlace();
        }
    }

}