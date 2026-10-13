public class Integer {
	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static int max(int a, int b, int c) {
		return max(max(a, b), c);
	}
}
