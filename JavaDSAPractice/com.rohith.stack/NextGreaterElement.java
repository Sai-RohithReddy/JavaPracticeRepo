import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4, 7, 3, 4, 8, 1};
        
        int[] res1 = nextGreaterElement1(arr);
        System.out.println(Arrays.toString(res1));

        int[] res2 = nextGreaterElement1(arr);
        System.out.println(Arrays.toString(res2));
    }
    public static int[] nextGreaterElement1(int[] arr) {
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int greaterElement = -1;
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    greaterElement = arr[j];
                    break;
                }
            }
            res[i] = greaterElement;
        }

        return res;
    }
    public static int[] nextGreaterElement2(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    }
}
