import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Original string: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Trimmed: " + str.trim());
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Substring (first 5 chars): " + str.substring(0, Math.min(5, str.length())));

        sc.close();
    }
}
