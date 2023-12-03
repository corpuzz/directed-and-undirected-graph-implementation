public class TestGraph {
    public static void main(String[] args) {

        // Adjacency Matrix (directed)
        AdjacencyMatrix directedMatrix = new AdjacencyMatrix(6, true);
        directedMatrix.addEdge(0, 1);
        directedMatrix.addEdge(1, 2);
        directedMatrix.addEdge(2, 4);
        directedMatrix.addEdge(4, 3);
        directedMatrix.addEdge(3, 1);
        directedMatrix.addEdge(4, 5);
        directedMatrix.printAdjacencyMatrix();

        System.out.println();

        // Adjacency Matrix (undirected)
        AdjacencyMatrix undirectedMatrix = new AdjacencyMatrix(6, false);
        undirectedMatrix.addEdge(0, 1);
        undirectedMatrix.addEdge(1, 2);
        undirectedMatrix.addEdge(2, 4);
        undirectedMatrix.addEdge(4, 3);
        undirectedMatrix.addEdge(3, 1);
        undirectedMatrix.addEdge(4, 5);
        undirectedMatrix.printAdjacencyMatrix();

        System.out.println();

        // Adjacency List (Directed)
        AdjacencyList directedList = new AdjacencyList(6, true);
        directedList.addEdge(0, 1);
        directedList.addEdge(1, 2);
        directedList.addEdge(2, 4);
        directedList.addEdge(4, 3);
        directedList.addEdge(3, 1);
        directedList.addEdge(4, 5);
        directedList.printAdjacencyList();

        System.out.println();

        // Adjacency List (undirected)
        AdjacencyList undirectedList = new AdjacencyList(6, false);
        undirectedList.addEdge(0, 1);
        undirectedList.addEdge(1, 2);
        undirectedList.addEdge(2, 4);
        undirectedList.addEdge(4, 3);
        undirectedList.addEdge(3, 1);
        undirectedList.addEdge(4, 5);
        undirectedList.printAdjacencyList();
    }
}
