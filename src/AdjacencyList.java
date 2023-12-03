import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class AdjacencyList {


    private final List<List<Integer>> adjacencyList;
    private final int numVertices;
    private final boolean isDirected;

    public AdjacencyList(int numVertices, boolean isDirected) {
        this.numVertices = numVertices;
        this.isDirected = isDirected;
        this.adjacencyList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new ArrayList<>()); // Initialize each linked list
        }
    }

    public void addEdge(int source, int destination) {
        if (source < 0 || source >= numVertices || destination < 0 || destination >= numVertices) {
            throw new IllegalArgumentException("Invalid vertex index");
        }
        adjacencyList.get(source).add(destination); // Add directed edge
        if (!isDirected) {
            adjacencyList.get(destination).add(source); // Add edge in reverse direction for undirected graphs
        }
    }

    public boolean hasEdge(int source, int destination) {
        if (source < 0 || source >= numVertices || destination < 0 || destination >= numVertices) {
            return false;
        }
        return adjacencyList.get(source).contains(destination); // Check if destination exists in source's list
    }

    public List<Integer> getNeighbors(int vertex) {
        if (vertex < 0 || vertex >= numVertices) {
            return Collections.emptyList();
        }
        return adjacencyList.get(vertex); // Return list of neighbors for the given vertex
    }

    public boolean isDirected() {
        return isDirected;
    }

    // Additional methods like printing the list, checking for cycles, etc. can be implemented here
    public void printAdjacencyList() {
        if(isDirected()) {
            System.out.println("Adjacency List (Directed):");

        } else {
            System.out.println("Adjacency List (Undirected):");
        }

        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ":");
            List<Integer> neighbors = adjacencyList.get(i);
            for (int neighbor : neighbors) {
                System.out.print(" " + neighbor);
            }
            System.out.println();
        }
    }

}
