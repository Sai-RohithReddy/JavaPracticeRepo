import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "([}])";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    char temp = stack.peek();
                    if (temp == '(' && c == ')' || temp == '[' && c == ']' || temp == '{' && c == '}') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
