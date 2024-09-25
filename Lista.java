public class Lista<T> implements ILista<T> {
    private Nodo<T> cabeza;

    public Lista() {
        cabeza = null;
    }

    public Lista(Nodo<T> cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo<T> getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo<T> cabeza) {
        this.cabeza = cabeza;
    }

    @Override
    public void inicializacionoCreacion() {
        // Implementación si es necesaria
    }

    @Override
    public Nodo<T> buscarElemento(T elementoABuscar) {
        if (estaVacia()) {
            System.out.println("No se puede buscar un elemento en la lista, ya que está vacía.");
            return null;
        }
        Nodo<T> auxNodo = cabeza;
        while (auxNodo != null) {
            if (auxNodo.getDato().equals(elementoABuscar)) {
                return auxNodo;
            }
            auxNodo = auxNodo.getEnlace();
        }
        return null;
    }

    @Override
    public void eliminarElemento(T elementoAEliminar) {
        if (estaVacia()) {
            System.out.println(":( No se puede eliminar: " + elementoAEliminar + ", la lista está vacía.");
            return;
        }
        if (cabeza.getDato().equals(elementoAEliminar)) {
            cabeza = cabeza.getEnlace();
            System.out.println(":) Elemento: " + elementoAEliminar + ", eliminado de la lista");
            return;
        }
        Nodo<T> auxNodo = cabeza;
        while (auxNodo.getEnlace() != null) {
            if (auxNodo.getEnlace().getDato().equals(elementoAEliminar)) {
                auxNodo.setEnlace(auxNodo.getEnlace().getEnlace());
                System.out.println(":) Elemento: " + elementoAEliminar + ", eliminado de la lista");
                return;
            }
            auxNodo = auxNodo.getEnlace();
        }
        System.out.println(":( El elemento: " + elementoAEliminar + ", no se encuentra en la lista");
    }

    @Override
    public boolean estaVacia() {
        return cabeza == null;
    }

    @Override
    public String toString() {
        return "Lista [cabeza=" + cabeza + "]";
    }

    @Override
    public void insertarElemento(T elementoAInsertar) {
        Nodo<T> nuevoNodo = new Nodo<>(); // se crea un nodo vacío
        nuevoNodo.setDato(elementoAInsertar); // se agrega el dato al nuevo nodo
        nuevoNodo.setEnlace(cabeza); // el enlace del nuevo nodo es la cabeza
        cabeza = nuevoNodo; // la cabeza es el nuevo nodo
    }

    @Override
    public void pop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }

    @Override
    public boolean seEncuentraElemento(T elementoAEncontrar) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'seEncuentraElemento'");
    }

    @Override
    public String recorrerLista() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recorrerLista'");
    }
}   
