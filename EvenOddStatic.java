class EvenOddStatic {
    static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println(num + " is " + checkEvenOdd(num));
    }
}
