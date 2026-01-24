import java.util.Scanner;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		
		int a = 0, b = 1, fib = 0;
		
		if (n == 0) {
			fib = 0;
		}
		else if (n == 1) {
			fib = 1;
		}
		else {
			for (int i = 2; i <= n; i++) {
				fib = a + b;
				a = b;
				b = fib;
			}
		}
		System.out.println("The " + n + "th Fibonacci number is " + fib + ".");
	}
}