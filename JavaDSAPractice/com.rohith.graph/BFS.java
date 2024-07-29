import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        GraphAdjMatrix gM = new GraphAdjMatrix(5);
        GraphAdjListOfLists gL = new GraphAdjListOfLists(5);

        gM.addUndirectedEdge(0, 1);
        gM.addUndirectedEdge(0, 3);
        gM.addUndirectedEdge(1, 2);
        gM.addUndirectedEdge(3, 2);
        gM.addUndirectedEdge(2, 4);

        gL.addUndirectedEdge(0, 1);
        gL.addUndirectedEdge(0, 3);
        gL.addUndirectedEdge(1, 2);
        gL.addUndirectedEdge(3, 2);
        gL.addUndirectedEdge(2, 4);

        bfs(gM, 0);
        bfs(gL, 0);
    }
    public static void bfs(GraphAdjMatrix g, int s) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[g.V];

        queue.offer(s);
        visited[s] = true;

        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.print(u + " ");
            for (int v = 0; v < g.V; v++) {
                if (g.adjMatrix[u][v] == 1 && !visited[v]) {
                    queue.offer(v);
                    visited[v] = true;
                }
            }
        }
        System.out.println();
    }
    public static void bfs(GraphAdjListOfLists g, int s) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[g.V];

        queue.offer(s);
        visited[s] = true;

        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.print(u + " ");

            for (int v : g.adjList.get(u)) {
                if (!visited[v]) {
                    queue.offer(v);
                    visited[v] = true;
                }
            }
        }
        System.out.println();
    }
}
