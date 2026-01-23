import java.util.Scanner;

public class FirstNFibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scanner.nextInt();
		
		int fib1 = 0, fib2 = 1;
		System.out.println("The first " + n + " Fibonacci numbers are:");
		
		int i = 0;
		while (i < n) {
			System.out.println(fib1);
			int next = fib1 + fib2;
			fib1 = fib2;
			fib2 = next;
			i++;
		}
	}
}