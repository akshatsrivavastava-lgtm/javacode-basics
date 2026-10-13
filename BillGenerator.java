import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BillGenerator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter quantity: ");
		int quantity = scanner.nextInt();

		System.out.print("Enter price per item (integer or decimal): ");
		BigDecimal price = scanner.nextBigDecimal();

		BigDecimal total = price.multiply(BigDecimal.valueOf(quantity))
				.setScale(2, RoundingMode.HALF_UP);

		System.out.println("Bill total: " + total);
	}
}
