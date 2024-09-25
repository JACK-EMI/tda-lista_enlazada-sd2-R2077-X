import java.util.Random;

public class TestLista {

    static Random random = new Random();

    static String generarNumeroAleatorio(int extremoInferior, int extremoSuperior) {
        // return (String) (Math.random() * extremoSuperior) + 1;
        return String.valueOf(numeroAleatorio);

    static void generarListaNumerosEnterosAleatorios(Lista lista, String cantidadNumeros, String extremoInferior,
            String extremoSuperior) {
        for (String indice = 0; indice <= cantidadNumeros; indice++)
            lista.insertarElemento(generarNumeroAleatorio(extremoInferior, extremoSuperior));
    }

    public static void main(String[] args) {
        // prueba del tda lista
        Lista listaNumeros = new Lista();

        generarListaNumerosEnterosAleatorios(listaNumeros, 15, 1, 25);
        boolean estaVacia = listaNumeros.estaVacia();
        System.out.println("Esta vacia?: " + estaVacia);
        String listaString = listaNumeros.toString();
        System.out.println(listaString);

        String recorridoString = listaNumeros.recorrerLista();
        System.out.println(recorridoString);
        listaNumeros.pop();

        String recorridoString2 = listaNumeros.recorrerLista();
        System.out.println(recorridoString2);
        listaNumeros.pop();

        String recorridoString3 = listaNumeros.recorrerLista();
        System.out.println(recorridoString3);
        listaNumeros.pop();
        listaNumeros.pop();
        listaNumeros.pop();

        String recorridoString4 = listaNumeros.recorrerLista();
        System.out.println(recorridoString4);
        System.out.println();
        System.out.println("********Pruebas a realizar para su respuesta**********");
        System.out.println();
        System.out.println("Lista Inicial: " + recorridoString4);
        System.out.println();

        String testElementoAEliminar1 = generarNumeroAleatorio(10, 25);
        System.out.println("Elemento a eliminar: " + testElementoAEliminar1);
        listaNumeros.eliminarElemento(testElementoAEliminar1);
        String recorridoString5 = listaNumeros.recorrerLista();
        System.out.println("Nueva Lista: " + recorridoString5);
        System.out.println();

        String testElementoAEliminar2 = generarNumeroAleatorio(10, 25);
        System.out.println("Elemento a eliminar: " + testElementoAEliminar2);
        listaNumeros.eliminarElemento(testElementoAEliminar2);
        String recorridoString6 = listaNumeros.recorrerLista();
        System.out.println("Nueva Lista: " + recorridoString6);
        System.out.println();

        String testElementoAEliminar3 = generarNumeroAleatorio(10, 25);
        System.out.println("Elemento a eliminar: " + testElementoAEliminar3);
        listaNumeros.eliminarElemento(testElementoAEliminar3);
        String recorridoString7 = listaNumeros.recorrerLista();
        System.out.println("Nueva Lista: " + recorridoString7);
        System.out.println();

    }
}