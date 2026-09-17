import java.util.Scanner;

public class StudentPassed {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter marks for 5 subjects: ");
		int total = 0;
		boolean passed = true;

		for (int i = 1; i <= 5; i++) {
			int mark = scanner.nextInt();
			total += mark;
			if (mark < 35) {
				passed = false;
			}
		}

		double percentage = total / 5.0;
		if (percentage < 40) {
			passed = false;
		}

		System.out.printf("Percentage: %.2f%%%n", percentage);
		System.out.println(passed ? "Student has passed." : "Student has not passed.");

		scanner.close();
	}
}
