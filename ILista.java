public interface ILista<T> {
    void inicializacionoCreacion();

    void insertarElemento(T elementoAInsertar);

    void eliminarElemento(T elementoAEliminar);

    void pop();

    Nodo<T> buscarElemento(T elementoABuscar);

    boolean seEncuentraElemento(T elementoAEncontrar);

    String recorrerLista();

    boolean estaVacia();
}
