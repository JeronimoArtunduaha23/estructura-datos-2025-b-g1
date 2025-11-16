import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        Graph mapa = new Graph(); // se crea el grafo para almacenar los datos

        // Agregar ciudades (vértices)
        mapa.addVertex("Cartagena");
        mapa.addVertex("Barranquilla");
        mapa.addVertex("Bucaramanga");
        mapa.addVertex("Cali");
        mapa.addVertex("Medellín");
        mapa.addVertex("Bogotá");

        // Agregar conexiones (carreteras)
        mapa.addEdge("Cartagena", "Barranquilla");
        mapa.addEdge("Barranquilla", "Medellín");
        mapa.addEdge("Bucaramanga", "Medellín");
        mapa.addEdge("Medellín", "Cali");
        mapa.addEdge("Cali", "Bogotá");
        mapa.addEdge("Bogotá", "Barranquilla");

        // Mostrar las conexiones del grafo
        System.out.println("Mapa de ciudades (lista de adyacencia):");
        mapa.printAdjacency();
        System.out.println();

        // Recorrido BFS desde Cartagena
        List<String> recorrido = mapa.bfs("Cartagena");
        System.out.println("Recorrido BFS desde 'Cartagena': " + recorrido);

        // Ejemplo adicional: BFS desde Bogotá
        System.out.println("Recorrido BFS desde 'Bogotá': " + mapa.bfs("Bogotá"));
    }
}

