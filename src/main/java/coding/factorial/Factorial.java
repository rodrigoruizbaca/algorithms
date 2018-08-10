package coding.factorial;

public class Factorial implements FactorialI {

	@Override
	public int factorial(int n) {
		if (n <= 1) {
			return 1;
		}
		return factorial(n-1)*n;
	}

}
