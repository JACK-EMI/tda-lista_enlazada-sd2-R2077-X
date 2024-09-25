public class ListaDoble<T> implements ILista<T> {

    private Nodo<T> cabeza;
    private Nodo<T> cola;

    public ListaDoble(Nodo<T> cabeza) {
        this.cabeza = cabeza;
        this.cola = cabeza; // Inicializa la cola como cabeza si solo se pasa una
    }

    public ListaDoble(Nodo<T> cabeza, Nodo<T> cola) {
        this.cabeza = cabeza;
        this.cola = cola;
    }

    @Override
    public void inicializacionoCreacion() {
        cabeza = null;
        cola = null;
    }

    @Override
    public void insertarElemento(T elementoAInsertar) {
        Nodo<T> nuevoNodo = new Nodo<>(); // Se crea un nodo vacío
        nuevoNodo.setDato(elementoAInsertar); // Se agrega el dato al nuevo nodo
        nuevoNodo.setEnlaceSiguiente(cabeza); // El enlace del nuevo nodo es la cabeza
        if (cabeza != null) {
            cabeza.setEnlaceAnterior(nuevoNodo); // Actualiza el enlace anterior de la cabeza
        }
        cabeza = nuevoNodo; // La cabeza es el nuevo nodo
        if (cola == null) {
            cola = nuevoNodo; // Si la cola es nula, también se establece como nuevo nodo
        }
    }

    @Override
    public void eliminarElemento(T elementoAEliminar) {
        if (estaVacia()) {
            System.out.println("La lista está vacía. No se puede eliminar el elemento.");
            return;
        }

        Nodo<T> actual = cabeza;
        while (actual != null) {
            if (actual.getDato().equals(elementoAEliminar)) {
                if (actual == cabeza) {
                    cabeza = cabeza.getEnlaceSiguiente();
                    if (cabeza != null) {
                        cabeza.setEnlaceAnterior(null);
                    }
                } else {
                    Nodo<T> anterior = actual.getEnlaceAnterior();
                    Nodo<T> siguiente = actual.getEnlaceSiguiente();
                    if (anterior != null) {
                        anterior.setEnlaceSiguiente(siguiente);
                    }
                    if (siguiente != null) {
                        siguiente.setEnlaceAnterior(anterior);
                    }
                }
                if (actual == cola) {
                    cola = actual.getEnlaceAnterior();
                }
                return;
            }
            actual = actual.getEnlaceSiguiente();
        }
        
        System.out.println("Elemento no encontrado: " + elementoAEliminar);
    }

    @Override
    public void pop() {
        if (estaVacia()) {
            System.out.println("La lista está vacía. No se puede hacer pop.");
            return;
        }
        eliminarElemento(cabeza.getDato());
    }

    @Override
    public Nodo<T> buscarElemento(T elementoABuscar) {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            if (actual.getDato().equals(elementoABuscar)) {
                return actual;
            }
            actual = actual.getEnlaceSiguiente();
        }
        return null;
    }

    @Override
    public boolean seEncuentraElemento(T elementoAEncontrar) {
        return buscarElemento(elementoAEncontrar) != null;
    }

    @Override
    public String recorrerLista() {
        StringBuilder resultado = new StringBuilder();
        Nodo<T> actual = cabeza;
        while (actual != null) {
            resultado.append(actual.getDato()).append(" ");
            actual = actual.getEnlaceSiguiente();
        }
        return resultado.toString().trim();
    }

    @Override
    public boolean estaVacia() {
        return cabeza == null;
    }

    public Nodo<T> getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo<T> cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo<T> getCola() {
        return cola;
    }

    public void setCola(Nodo<T> cola) {
        this.cola = cola;
    }
}
