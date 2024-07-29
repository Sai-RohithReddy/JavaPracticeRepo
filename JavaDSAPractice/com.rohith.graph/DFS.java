import java.util.Stack;

public class DFS {
    public static void main(String[] args) {
        GraphAdjMatrix gM = new GraphAdjMatrix(5);

        gM.addUndirectedEdge(0, 1);
        gM.addUndirectedEdge(0, 3);
        gM.addUndirectedEdge(1, 2);
        gM.addUndirectedEdge(3, 2);
        gM.addUndirectedEdge(2, 4);

        dfs(gM, 0);
        System.out.println();
        dfsRec(gM, 0);
    }
    public static void dfs(GraphAdjMatrix g, int s) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[g.V];

        stack.push(s);

        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (!visited[u]) {
                System.out.print(u + " ");
                visited[u] = true;
                for (int v = 0; v < g.V; v++) {
                    if (g.adjMatrix[u][v] == 1 && !visited[v]) {
                        stack.push(v);
                    }
                }
            }
        }
    }

    public static void dfsRec(GraphAdjMatrix g, int s) {
        boolean[] visited = new boolean[g.V];

        if (!visited[s]) {
            dfsUtil(g, s, visited);
        }
    }
    private static void dfsUtil(GraphAdjMatrix g, int s, boolean[] visited) {
        System.out.print(s + " ");
        visited[s] = true;

        for (int v = 0; v < g.V; v++) {
            if (!visited[v]) {
                dfsUtil(g, v, visited);
            }
        }
    }
}
