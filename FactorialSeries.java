import java.util.Scanner;

public class FactorialSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		
		long fact = 1;
		System.out.println("Factories series up to " + n + " is ");
		
		for (int i = 1; i <= n; i++) {
			fact *= i;
			System.out.print(fact + " ");
		}
	}
}