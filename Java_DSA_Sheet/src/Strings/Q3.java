package Strings;

import java.util.Stack;

public class Q3 {

	public static void main(String[] args) {

		Q3 q3 = new Q3();
		
		String s = "()";
		
		System.out.println(q3.isValidParentheses(s));
	}
	public boolean isValidParentheses(String s) {
		
		if (s.length() <= 1) return false;
		
		Stack<Character> stack = new Stack<>();
		
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				} else {
					char ch = stack.peek();
					if (
							(c == ')' && ch =='(') ||
							(c == '}' && ch == '{') ||
							(c == ']' && ch == '[')
							) 
					{
						stack.pop();
					} else {
						return false;
					}
				}
			}
			
		}
		return stack.isEmpty();
	}
}
