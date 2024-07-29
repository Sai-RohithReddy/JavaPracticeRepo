public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {12, 34, 2, 34, 33, 1};
        int res = secondMax(arr);
        System.out.println(res);
    }
    public static int secondMax(int[] arr) {
        int max = 0;
        int secMax = 0;

        for (int i : arr) {
            if (i > max) {
                secMax = max;
                max = i;
            }
            if (i > secMax && i != max) secMax = i;
        }
        return secMax;
    }
}
