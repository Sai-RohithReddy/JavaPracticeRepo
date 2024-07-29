public class SpiralPrint {
    public static void main(String[] args) {
        int[][] grid = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        spiralPring(grid);
    }
    public static void spiralPring(int[][] grid) {
        int r = grid.length, c = grid.length, k = 0, l = 0;

        while (k < r && l < c) {
            for (int i = l; i < c; i++) {
                System.out.print(grid[k][i] + " ");
            }
            k++;
            for (int i = k; i < r; i++) {
                System.out.print(grid[i][c - 1] + " ");
            }
            c--;
            if (k < r) {
                for (int i = c - 1; i >= l; i--) {
                    System.out.print(grid[r - 1][i] + " ");
                }
            }
            r--;
            if (l < c) {
                for (int i = r - 1; i >= k; i--) {
                    System.out.print(grid[i][l] + " ");
                }
            }
            l++;
        }
    }
}
