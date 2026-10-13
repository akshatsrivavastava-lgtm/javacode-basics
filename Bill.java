public class Bill {
	// Overloaded methods calculate the bill for whole-number and decimal prices.
	public static int calculateBill(int quantity, int price) {
		return quantity * price;
	}

	public static double calculateBill(int quantity, double price) {
		return quantity * price;
	}

	public static void main(String[] args) {
		int quantity = 3;
		int wholeNumberPrice = 100;
		double decimalPrice = 99.50;

		System.out.println("Bill: " + calculateBill(quantity, wholeNumberPrice));
		System.out.println("Bill: " + calculateBill(quantity, decimalPrice));
	}
}
