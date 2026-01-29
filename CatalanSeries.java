import java.util.Scanner;

public class CatalanSeries {
	
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
		
		System.out.println("Catalan series up to " + n + " is ");
		for (int i = 0; i < n; i++) {
			System.out.print(catalan(i) + " ");
		}

	}
}