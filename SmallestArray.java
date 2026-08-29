import java.util.Scanner;
public class SmallestArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the number of elements: ");
		  int size = scanner.nextInt();
         if (size <= 0) {
			System.out.println("Array size must be greater than zero.");
			scanner.close();
			return;
		}
         int[] numbers = new int[size];
		System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
			numbers[i] = scanner.nextInt();
		} int smallest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		} System.out.println("Smallest number: " + smallest);
		scanner.close();
	}
}
