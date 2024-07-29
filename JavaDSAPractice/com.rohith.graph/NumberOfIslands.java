public class NumberOfIslands {
    public static void main(String[] args) {
        GraphAdjMatrix g = new GraphAdjMatrix(4);

        g.addDirectedEdge(0, 0);
        g.addDirectedEdge(0, 1);
        g.addDirectedEdge(1, 0);
        g.addDirectedEdge(2, 2);
        g.addDirectedEdge(3, 3);

        for (int i = 0; i < g.V; i++) {
            for (int j = 0; j < g.V; j++) {
                System.out.print(g.adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(numberOfIslands(g));
    }
    public static int numberOfIslands(GraphAdjMatrix g) {
        int r = g.adjMatrix.length;
        int c = g.adjMatrix[0].length;
        int count = 0;
        boolean[][] visited = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (!visited[i][j] && g.adjMatrix[i][j] == 1) {
                    DFS(g, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }
    public static void DFS(GraphAdjMatrix g, int r, int c, boolean[][] visited) {
        if (r < 0 || c < 0 || r >= g.V || c >= g.V || visited[r][c] || g.adjMatrix[r][c] == 0) return;

        visited[r][c] = true;
        DFS(g, r, c - 1, visited);
        DFS(g, r - 1, c, visited);
        DFS(g, r, c + 1, visited);
        DFS(g, r + 1, c, visited);
    }
}
