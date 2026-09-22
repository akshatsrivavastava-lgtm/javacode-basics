import java.util.Scanner;

public class TwoNoLies {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the lower and upper values: ");
		int lower = scanner.nextInt();
		int upper = scanner.nextInt();

		if (lower > upper) {
			int temp = lower;
			lower = upper;
			upper = temp;
		}

		System.out.print("Enter two numbers: ");
		int first = scanner.nextInt();
		int second = scanner.nextInt();

		boolean bothBetween = first >= lower && first <= upper
				&& second >= lower && second <= upper;
		System.out.println(bothBetween
				? "Both numbers lie between the values."
				: "Both numbers do not lie between the values.");

		scanner.close();
	}
}
