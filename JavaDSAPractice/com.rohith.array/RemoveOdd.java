import java.util.Arrays;

public class RemoveOdd {
    public static void main(String[] args) {
        int[] arr = {3,2,4,7,10,6,5};
        int[] res = removeEven(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] removeEven(int[] arr) {
        int oddCount = 0;

        for (int i : arr) {
            if (i % 2 != 0) oddCount++;
        } 

        int[] res = new int[oddCount];
        int resIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) res[resIdx++] = arr[i];
        }

        return res;
    }
}