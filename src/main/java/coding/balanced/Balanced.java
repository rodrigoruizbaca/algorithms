package coding.balanced;

import java.util.Stack;

public class Balanced implements BalancedI {

	@Override
	public boolean isBalanaced(String str) {
		Stack<Character> stack = new Stack<>();
		char[] arr = str.toCharArray();
		for (char c : arr) {
			if (c == '{' || c == '(' || c == '[') {
				stack.push(c);
			}
			if (c == '}') {
				if (stack.isEmpty())
					return false;
				char poped = stack.pop();
				if (poped != '{')
					return false;
			}
			if (c == ')') {
				if (stack.isEmpty())
					return false;
				char poped = stack.pop();
				if (poped != '(')
					return false;
			}
			if (c == ']') {
				if (stack.isEmpty())
					return false;
				char poped = stack.pop();
				if (poped != '[')
					return false;
			}
		}
		return stack.isEmpty();

	}

}
