import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 10;

        System.out.println("Binary of 9: " + Integer.toBinaryString(num1));
        System.out.println("Binary of 10: " + Integer.toBinaryString(num2));

        if (Integer.toBinaryString(num1).equals(Integer.toBinaryString(num2))) {
            System.out.println("Both numbers are equivalent in binary.");
        } else {
            System.out.println("They are not equivalent in binary.");
        }
    }
}
