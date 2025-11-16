## EJERCICIO 1 – Red Social

| Operación       | Descripción                                          | Pasos aproximados | Complejidad  |
|-----------------|------------------------------------------------------|-------------------|--------------|
| `addVertex()`   | Agregar usuario (vértice)                            | 1 paso            | **O(1)**     |
| `addEdge()`     | Crear amistad (conexión bidireccional)               | 1 paso            | **O(1)**     |
| `printAdjacency()` | Mostrar lista de conexiones                      | V + E pasos       | **O(V + E)** |
| `bfs("Jeronimo")` | Recorrido desde usuario inicial Jeronimo          | V + E pasos       | **O(V + E)** |
| `bfs("Kevin")`  | Recorrido desde otro usuario                        | V + E pasos       | **O(V + E)** |

## EJERCICIO 2 – Mapa de Ciudades

| Operación       | Descripción                                | Pasos aproximados | Complejidad  |
|-----------------|--------------------------------------------|-------------------|--------------|
| `addVertex()`   | Agregar ciudad                             | 1 paso            | **O(1)**     |
| `addEdge()`     | Conectar dos ciudades mediante carretera   | 1 paso            | **O(1)**     |
| `printAdjacency()` | Mostrar mapa de conexiones              | V + E pasos       | **O(V + E)** |
| `bfs("Bogotá")` | Recorrer el mapa desde una ciudad origen   | V + E pasos       | **O(V + E)** |

## EJERCICIO 3 – Componentes Conexos

| Operación       | Descripción                                          | Pasos aproximados | Complejidad    |
|-----------------|------------------------------------------------------|-------------------|----------------|
| `addVertex()`   | Agregar vértice aislado                              | 1 paso            | **O(1)**       |
| `addEdge()`     | Conectar nodos dentro de un componente               | 1 paso            | **O(1)**       |
| `bfs("A")`      | Recorrer un componente independiente                 | V₁ + E₁ pasos     | **O(V₁ + E₁)** |

## EJERCICIO 4 – Comparación BFS vs DFS

| Algoritmo  | Descripción                                      | Pasos aproximados | Complejidad  |
|------------|--------------------------------------------------|-------------------|--------------|
| `bfs("A")` | Recorrido por niveles (anchura)                  | V + E pasos       | **O(V + E)** |
| `dfs("A")` | Recorrido en profundidad (pila o recursión)      | V + E pasos       | **O(V + E)** |
