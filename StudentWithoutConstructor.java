public class StudentWithoutConstructor {
    String name;
    int age;

    public static void main(String[] args) {
        StudentWithoutConstructor student = new StudentWithoutConstructor();
        student.name = "Alex";
        student.age = 20;

        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
    }
}