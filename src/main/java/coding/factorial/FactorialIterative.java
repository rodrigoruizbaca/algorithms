package coding.factorial;

import java.util.Stack;

public class FactorialIterative implements FactorialI {

	@Override
	public int factorial(int n) {
		if (n <= 0) return 1;
		Stack<Integer> stack = new Stack<>();		
		while (n > 0) {
			stack.push(n--);
		}
		int result = 1;
		while (!stack.isEmpty()) {
			result *= stack.pop();
		}
		return result;
	}

}
