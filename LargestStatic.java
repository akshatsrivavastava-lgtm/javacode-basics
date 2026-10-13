import java.util.Scanner;

public class LargestStatic {
	static int largest(int first, int second, int third) {
		return Math.max(first, Math.max(second, third));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		int third = scanner.nextInt();

		System.out.println("Largest number: " + largest(first, second, third));
		scanner.close();
	}
}
