public class StudentWithConstructor {
    private String name;
    private int age;

    public StudentWithConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        StudentWithConstructor student = new StudentWithConstructor("Alice", 20);
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
    }
}