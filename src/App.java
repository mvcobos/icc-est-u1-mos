public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodo de ordenamiento Seleccion");
        MetodosOrdenamiento mO = new MetodosOrdenamiento();
        int[] arreglo = {10, 5, 8, 6, 95, 243};
        int[] arregloOrdenado = mO.sortBySeleccion(arreglo, true);
        mO.printArreglo(arregloOrdenado);  
    }
}
