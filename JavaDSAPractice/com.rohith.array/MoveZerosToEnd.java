import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 4, 12};
        int[] arr2 = {0, 1, 0, 4, 12};
        moveZerosToEnd1(arr1);
        System.out.println(Arrays.toString(arr1));
        moveZerosToEnd2(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    public static void moveZerosToEnd1(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        for (int i = count; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
    public static void moveZerosToEnd2(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) j++;
        }
    }
}
