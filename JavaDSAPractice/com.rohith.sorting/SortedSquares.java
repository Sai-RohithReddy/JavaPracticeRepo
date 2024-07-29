import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        int[] res = sort(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] sort(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int[] res = new int[arr.length];
        
        for (int k = arr.length - 1; k >= 0; k--) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                res[k] = arr[i] * arr[i];
                i++;
            } else {
                res[k] = arr[j] * arr[j];
                j--;
            }
        }

        return res;
    }
}
