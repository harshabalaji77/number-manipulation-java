import java.util.Scanner;

public class NthCatalanNumber {
	
	public static int catalan(int n) {
        if (n <= 1)
            return 1;

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += catalan(i) * catalan(n - i - 1);
        }
        return result;
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
        int n = scanner.nextInt();

        System.out.println("The " + n + "th Catalan Number is " + catalan(n) + ".");
	}
}