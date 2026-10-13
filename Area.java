public class Area {
	
	public static int area(int side) {
		return side * side;
	}

	
	public static double area(double length, double width) {
		return length * width;
	}

	
	public static double area(double radius) {
		return Math.PI * radius * radius;
	}

	public static void main(String[] args) {
		System.out.println("Area of square: " + area(5));
		System.out.println("Area of rectangle: " + area(4.0, 6.0));
		System.out.println("Area of circle: " + area(3.0));
	}
}
