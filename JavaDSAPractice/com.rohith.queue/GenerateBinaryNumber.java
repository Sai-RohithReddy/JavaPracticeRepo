import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumber {
    public static void main(String[] args) {
        String[] res = generateBinaryNumber(7);
        System.out.println(Arrays.toString(res));
    }
    public static String[] generateBinaryNumber(int n) {
        String[] res = new String[n];
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");

        for (int i = 0; i < n; i++) {
            res[i] = queue.poll();
            String t1 = res[i] + "0";
            String t2 = res[i] + "1";
            queue.offer(t1);
            queue.offer(t2);
        }
        return res;
    }
}
