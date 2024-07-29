public class RowColSearch {
    public static void main(String[] args) {
        int[][] grid = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 51}
        };
        search(grid, 299);
    }
    public static void search(int[][] grid, int t) {
        int n = grid.length;
        int i = 0;
        int j = n - 1;

        while (i < n && j >= 0) {
            if (grid[i][j] == t) {
                System.out.println("found at: " + i + ", " + j);
                return;
            }
            if (grid[i][j] > t) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Element not found");
    }
}
