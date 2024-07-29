public class GraphAdjMatrix {
    public int V;
    public int[][] adjMatrix;

    public GraphAdjMatrix(int V) {
        this.V = V;
        this.adjMatrix = new int[V][V];
    }

    public void addUndirectedEdge(int u, int v) {
        this.adjMatrix[u][v] = 1;
        this.adjMatrix[v][u] = 1;
    }

    public void addDirectedEdge(int u, int v) {
        this.adjMatrix[u][v] = 1;
    }
}
