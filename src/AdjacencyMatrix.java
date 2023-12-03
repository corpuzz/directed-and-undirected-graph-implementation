import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacencyMatrix {

    private final int[][] adjacencyMatrix;
    private final int numVertices;
    private final boolean isDirected;

    public AdjacencyMatrix(int numVertices, boolean isDirected) {
        this.numVertices = numVertices;
        this.isDirected = isDirected;
        this.adjacencyMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int source, int destination) {
        if (source < 0 || source >= numVertices || destination < 0 || destination >= numVertices) {
            throw new IllegalArgumentException("Invalid vertex index");
        }
        adjacencyMatrix[source][destination] = 1; // Add edge from source to destination
        if (!isDirected) {
            adjacencyMatrix[destination][source] = 1; // Add edge from destination to source for undirected graphs
        }
    }

    public boolean hasEdge(int source, int destination) {
        if (source < 0 || source >= numVertices || destination < 0 || destination >= numVertices) {
            return false;
        }
        return adjacencyMatrix[source][destination] == 1;
    }

    public List<Integer> getNeighbors(int vertex) {
        if (vertex < 0 || vertex >= numVertices) {
            return Collections.emptyList();
        }
        List<Integer> neighbors = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) {
            if (adjacencyMatrix[vertex][i] == 1) {
                neighbors.add(i);
            }
        }
        return neighbors;
    }

    public boolean isDirected() {
        return isDirected;
    }

    public void printAdjacencyMatrix() {
        if(isDirected()) {
            System.out.println("Adjacency Matrix (Directed):");

        } else {
            System.out.println("Adjacency Matrix (Undirected):");
        }

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
