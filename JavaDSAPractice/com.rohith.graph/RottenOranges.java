import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public static void main(String[] args) {
        int v[][] = { { 2, 1, 0, 2, 1 },
                { 1, 0, 1, 2, 1 },
                { 1, 0, 0, 2, 1 } };

        int v2[][] = { { 2, 1, 0, 2, 1 },
                { 0, 0, 1, 2, 1 },
                { 1, 0, 0, 2, 1 } };

        System.out.println("Max time incurred: " + orangesRotting(v));
        // System.out.println("Max time incurred: " + orangesRotting(v2));

        // System.out.println("Max time incurred: " + orangesRottingBFS(v));
        // System.out.println("Max time incurred: " + orangesRottingBFS(v2));
    }

    public static int orangesRotting(int[][] grid) {
        // Code here
        int res = 2;
        int R = grid.length;
        int C = grid[0].length;
        boolean changed = false;

        while (true) {
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    if (grid[i][j] == res) {
                        if (isSafe(i + 1, j, R, C) && grid[i + 1][j] == 1) {
                            grid[i + 1][j] = grid[i][j] + 1;
                            changed = true;
                        }
                        if (isSafe(i, j + 1, R, C) && grid[i][j + 1] == 1) {
                            grid[i][j + 1] = grid[i][j] + 1;
                            changed = true;
                        }
                        if (isSafe(i - 1, j, R, C) && grid[i - 1][j] == 1) {
                            grid[i - 1][j] = grid[i][j] + 1;
                            changed = true;
                        }
                        if (isSafe(i, j - 1, R, C) && grid[i][j - 1] == 1) {
                            grid[i][j - 1] = grid[i][j] + 1;
                            changed = true;
                        }
                    }
                }
            }
            // for (int i = 0; i < R; i++) {
            // for (int j = 0; j < C; j++) {
            // System.out.print(grid[i][j] + " ");
            // }
            // System.out.println();
            // }
            // System.out.println("----------------------------");
            if (!changed)
                break;
            changed = false;
            res++;
        }
        return isRotten(grid) ? res - 2 : -1;
    }

    public static boolean isSafe(int i, int j, int R, int C) {
        return (i >= 0 && i < R && j >= 0 && j < C);
    }

    public static boolean isRotten(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    return false;
            }
        }
        return true;
    }

    static class Ele {
        int x, y;

        public Ele(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int orangesRottingBFS(int[][] grid) {

        int R = grid.length;
        int C = grid[0].length;
        Queue<Ele> Q = new LinkedList<>();
        int ans = 0;

        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++)
                if (grid[i][j] == 2)
                    Q.add(new Ele(i, j));

        Q.add(new Ele(-1, -1));

        while (!Q.isEmpty()) {
            boolean flag = false;
            while (!isDelim(Q.peek())) {
                Ele temp = Q.poll();

                if (isSafe(temp.x + 1, temp.y, R, C) && grid[temp.x + 1][temp.y] == 1) {
                    if (!flag) {

                        ans++;
                        flag = true;
                    }
                    grid[temp.x + 1][temp.y] = 2;
                    Q.add(new Ele(temp.x + 1, temp.y));;
                }
                if (isSafe(temp.x - 1, temp.y, R, C) && grid[temp.x - 1][temp.y] == 1) {
                    if (!flag) {
                        ans++;
                        flag = true;
                    }
                    grid[temp.x - 1][temp.y] = 2;
                    Q.add(new Ele(temp.x - 1,temp.y));
                }
                if (isSafe(temp.x, temp.y + 1, R, C) && grid[temp.x][temp.y + 1] == 1) {
                    if (!flag) {
                        ans++;
                        flag = true;
                    }
                    grid[temp.x][temp.y + 1] = 2;
                    Q.add(new Ele(temp.x,temp.y + 1));
                }
                if (isSafe(temp.x, temp.y - 1, R, C) && grid[temp.x][temp.y - 1] == 1) {
                    if (!flag) {
                        ans++;
                        flag = true;
                    }
                    // grid[temp.x][temp.y - 1] = 2;
                    Q.add(new Ele(temp.x, temp.y - 1));
                }
            }
            Q.poll();
            if (!Q.isEmpty()) {
                Q.add(new Ele(-1, -1));
            }
        }
        return (isRotten(grid)) ? ans : -1;
    }

    private static boolean isDelim(Ele ele) {
        return ele.x == -1 && ele.y == -1;
    }
}
