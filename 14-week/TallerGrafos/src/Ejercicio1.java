import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        Graph red = new Graph(); // se crea un objeto grafo llamado red para poder representar la red social

        // nombramos el grafo y mediante addVertex Agregamos usuarios (vértices, claves)
        red.addVertex("Jeronimo");
        red.addVertex("Kevin");
        red.addVertex("Santiago");
        red.addVertex("Sebastian");
        red.addVertex("Carlos");
        red.addVertex("Miguel");

        // llamamos el grafo y mediante add.Edge Agregamos amistades (aristas, valores)
        red.addEdge("Jeronimo", "Kevin");
        red.addEdge("Jeronimo", "Santiago");
        red.addEdge("Kevin", "Sebastian");
        red.addEdge("Santiago", "Carlos");
        red.addEdge("Sebastian", "Miguel");
        red.addEdge("Carlos", "Miguel");

        // Imprimimos la lista de adyacencia
        System.out.println("Lista de adyacencia:");
        red.printAdjacency();
        System.out.println();

        // Recorrido BFS desde "Jeronimo"
        List<String> recorrido = red.bfs("Jeronimo");
        System.out.println("Recorrido BFS desde 'Jeronimo': " + recorrido);

        // prueba BFS desde otro usuario:
        System.out.println("Recorrido BFS desde 'Kevin': " + red.bfs("Kevin"));
    }
}

