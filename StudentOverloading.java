public class StudentOverloading {
	static double average(int mark1, int mark2) {
		return (mark1 + mark2) / 2.0;
	}

	static double average(int mark1, int mark2, int mark3) {
		return (mark1 + mark2 + mark3) / 3.0;
	}

	public static void main(String[] args) {
		System.out.println("Average for two subjects: " + average(80, 90));
		System.out.println("Average for three subjects: " + average(80, 90, 85));
	}
}
