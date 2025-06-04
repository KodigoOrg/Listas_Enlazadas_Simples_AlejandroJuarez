/**
 * Clase principal para demostrar el uso de una lista enlazada simple.
 */
public class Main {

    /**
     * Metodo principal que demuestra operaciones básicas en una lista enlazada simple.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();

        // Demostración de operaciones con la lista
        System.out.println("Demostracion de la lista enlazada simple");
        System.out.println("Es una lista vacia? " + lista.esListaVacia());

        // Inserción de elementos
        lista.insertarAlInicio(10);
        lista.insertarAlInicio(20);
        lista.insertarAlInicio(30);
        lista.insertarAlFinal(5);

        // Eliminación de elementos
        lista.eliminar(20);
        lista.eliminarAlInicio();

        // Búsqueda de elementos
        System.out.println("EXISTE EL NUMERO 20? " + lista.buscar(20));
        System.out.println("EXISTE EL NUMERO 10? " + lista.buscar(10));

        // Información de la lista
        System.out.println("Tamanio de la lista: " + lista.tamanio());
        System.out.println("Informe de memoria: " + lista.informacionMemoria());

        // Impresión de la lista
        lista.imprimir();
    }
}