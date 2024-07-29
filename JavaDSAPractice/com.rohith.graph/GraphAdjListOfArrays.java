import java.util.LinkedList;

public class GraphAdjListOfArrays {
    public int V;
    public LinkedList<Integer>[] adjList;

    @SuppressWarnings("unchecked")
    public GraphAdjListOfArrays(int V) {
        this.V = V;
        this.adjList = new LinkedList[V];

        for (int i = 0; i < V; i++) {
            this.adjList[i] = new LinkedList<>();
        }
    }

    public void addDirectedEdge(int u, int v) {
        this.adjList[u].add(v);
    }

    public void addUndirectedEdge(int u, int v) {
        this.adjList[u].add(v);
        this.adjList[v].add(u);
    }
}
