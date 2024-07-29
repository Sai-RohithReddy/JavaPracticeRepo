import java.util.Arrays;

public class ConnectedComponents {
    public static void main(String[] args) {
        GraphAdjListOfArrays g = new GraphAdjListOfArrays(6);

        g.addUndirectedEdge(0, 1);
        g.addUndirectedEdge(0, 3);
        g.addUndirectedEdge(2, 4);
        g.addUndirectedEdge(5, 5);

        for (int i = 0; i < g.V; i++) {
            System.out.print(i + " edges are : ");
            for (int j = 0; j < g.adjList[i].size(); j++) {
                System.out.print(g.adjList[i].get(j) + " ");
            }
            System.out.println();
        }

        System.out.println(connectedComponents(g));
    }
    public static int connectedComponents(GraphAdjListOfArrays g) {
        boolean[] visited = new boolean[g.V];
        int[] compId = new int[g.V];
        int count = 0;

        for (int i = 0; i < g.V; i++) {
            if (!visited[i]) {
                count++;
                DFS(g, i, visited, compId, count);
                // count++;
            }
        }
        System.out.println(Arrays.toString(compId));
        return count;
    }
    public static void DFS(GraphAdjListOfArrays g, int u, boolean[] visited, int[] compId, int count) {
        visited[u] = true;
        compId[u] = count;

        for (int v : g.adjList[u]) {
            if (!visited[v]) {
                DFS(g, v, visited, compId, count);
            }
        }
    }
}
