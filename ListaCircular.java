public class ListaCircular<T> implements ILista<T> {

    private Nodo<T> cabeza;
    private Nodo<T> cola;

    @Override
    public void inicializacionoCreacion() {
        // Implementación de inicialización o creación
        cabeza = null;
        cola = null;
    }

    @Override
    public void insertarElemento(T elementoAInsertar) {
        Nodo<T> nuevoNodo = new Nodo<>(elementoAInsertar);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            nuevoNodo.setEnlaceSiguiente(cabeza); // Circular
        } else {
            cola.setEnlaceSiguiente(nuevoNodo);
            nuevoNodo.setEnlaceSiguiente(cabeza);
            cola = nuevoNodo;
        }
    }

    @Override
    public void eliminarElemento(T elementoAEliminar) {
        if (estaVacia()) {
            System.out.println("La lista está vacía. No se puede eliminar el elemento.");
            return;
        }

        Nodo<T> actual = cabeza;
        Nodo<T> anterior = cola;

        do {
            if (actual.getDato().equals(elementoAEliminar)) {
                if (actual == cabeza) {
                    cabeza = cabeza.getEnlaceSiguiente();
                    cola.setEnlaceSiguiente(cabeza); // Actualiza el enlace
                } else if (actual == cola) {
                    cola = anterior;
                    cola.setEnlaceSiguiente(cabeza); // Actualiza el enlace
                } else {
                    anterior.setEnlaceSiguiente(actual.getEnlaceSiguiente());
                }
                return;
            }
            anterior = actual;
            actual = actual.getEnlaceSiguiente();
        } while (actual != cabeza);
        
        System.out.println("Elemento no encontrado: " + elementoAEliminar);
    }

    @Override
    public void pop() {
        // Implementar lógica para eliminar el último elemento
        if (estaVacia()) {
            System.out.println("La lista está vacía. No se puede hacer pop.");
            return;
        }
        eliminarElemento(cola.getDato());
    }

    @Override
    public Nodo<T> buscarElemento(T elementoABuscar) {
        if (estaVacia()) {
            return null;
        }

        Nodo<T> actual = cabeza;
        do {
            if (actual.getDato().equals(elementoABuscar)) {
                return actual;
            }
            actual = actual.getEnlaceSiguiente();
        } while (actual != cabeza);
        
        return null;
    }

    @Override
    public boolean seEncuentraElemento(T elementoAEncontrar) {
        return buscarElemento(elementoAEncontrar) != null;
    }

    @Override
    public String recorrerLista() {
        if (estaVacia()) {
            return "La lista está vacía.";
        }

        StringBuilder resultado = new StringBuilder();
        Nodo<T> actual = cabeza;
        do {
            resultado.append(actual.getDato()).append(" ");
            actual = actual.getEnlaceSiguiente();
        } while (actual != cabeza);
        
        return resultado.toString();
    }

    @Override
    public boolean estaVacia() {
        return cabeza == null;
    }

    public Nodo<T> getCabeza() {
        return cabeza;
    }

    public Nodo<T> getCola() {
        return cola;
    }

    public void setCabeza(Nodo<T> cabeza) {
        this.cabeza = cabeza;
    }

    public void setCola(Nodo<T> cola) {
        this.cola = cola;
    }
}
