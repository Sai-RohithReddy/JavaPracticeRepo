import java.util.LinkedList;

public class GraphAdjListOfLists {
    public int V;
    public LinkedList<LinkedList<Integer>> adjList;

    public GraphAdjListOfLists(int V) {
        this.V = V;
        this.adjList = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            this.adjList.add(new LinkedList<>());
        }
    }

    public void addUndirectedEdge(int u, int v) {
        this.adjList.get(u).add(v);
        this.adjList.get(v).add(u);
    }

    public void addDirectedEdge(int u, int v) {
        this.adjList.get(u).add(v);
    }
    public static void main(String[] args) {
        GraphAdjListOfLists adj = new GraphAdjListOfLists(5);

        adj.addDirectedEdge(0, 1);
        adj.addDirectedEdge(0, 3);
        adj.addDirectedEdge(0, 4);
        adj.addDirectedEdge(1, 2);
        adj.addDirectedEdge(2, 3);
        adj.addDirectedEdge(3, 4);
        adj.addDirectedEdge(4, 0);

        for (int i = 0; i < adj.adjList.size(); i++) {
            System.out.print("Vertes " + i + " edges: ");
            for (int j : adj.adjList.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
