public class CircleClass {
	private double radius;

	public CircleClass(double radius) {
		this.radius = radius;
	}

	public void calculateAndDisplayArea() {
		double area = Math.PI * radius * radius;
		System.out.println("Area: " + area);
	}

	public void calculateAndDisplayCircumference() {
		double circumference = 2 * Math.PI * radius;
		System.out.println("Circumference: " + circumference);
	}
}
