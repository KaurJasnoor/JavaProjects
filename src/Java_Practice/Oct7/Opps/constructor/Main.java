package Java_Practice.Oct7.Opps.constructor;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.showStudent();

        Student s2 = new Student(101);
        s2.showStudent();

        Student s3 = new Student(102, "Noor");
        s3.showStudent();
    }
}
