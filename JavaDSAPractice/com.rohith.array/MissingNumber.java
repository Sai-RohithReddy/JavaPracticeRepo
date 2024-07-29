public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 8, 6, 3, 7};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
        int n = arr.length + 1;
        int res = n * (n + 1) / 2;

        for (int i : arr) {
            res -= i;
        }

        return res;
    }
}
