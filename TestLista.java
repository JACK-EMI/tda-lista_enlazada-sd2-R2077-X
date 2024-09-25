import java.util.Random;

public class TestLista {

    static Random random = new Random();

    static int generarNumeroAleatorio(int extremoInferior, int extremoSuperior) {
        // Genera un número aleatorio en el rango [extremoInferior, extremoSuperior]
        return random.nextInt(extremoSuperior - extremoInferior + 1) + extremoInferior;
    }

    static void generarListaNumerosEnterosAleatorios(ListaDoble<Integer> lista, int cantidadNumeros, int extremoInferior,
            int extremoSuperior) {
        for (int indice = 0; indice < cantidadNumeros; indice++) {
            lista.insertarElemento(generarNumeroAleatorio(extremoInferior, extremoSuperior));
        }
    }

    public static void main(String[] args) {
        // Prueba del TDA lista
        ListaDoble<Integer> listaNumeros = new ListaDoble<>();

        generarListaNumerosEnterosAleatorios(listaNumeros, 15, 1, 25);
        boolean estaVacia = listaNumeros.estaVacia();
        System.out.println("¿Está vacía?: " + estaVacia);
        String listaString = listaNumeros.recorrerLista();
        System.out.println("Lista inicial: " + listaString);

        listaNumeros.pop();
        System.out.println("Después de un pop: " + listaNumeros.recorrerLista());

        listaNumeros.pop();
        System.out.println("Después de otro pop: " + listaNumeros.recorrerLista());

        System.out.println("\n********Pruebas a realizar para su respuesta**********\n");

        // Pruebas de eliminación
        for (int i = 0; i < 3; i++) {
            int testElementoAEliminar = generarNumeroAleatorio(10, 25);
            System.out.println("Elemento a eliminar: " + testElementoAEliminar);
            listaNumeros.eliminarElemento(testElementoAEliminar);
            System.out.println("Nueva lista: " + listaNumeros.recorrerLista());
            System.out.println();
        }
    }
}
