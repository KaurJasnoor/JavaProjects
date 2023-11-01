package Java_Practice.Oct28.Test;

public class MainStudent {
    public static void main(String[] args) {
        Student<Integer, String> student = new Student<>(101, "Jasnoor");
        Integer id = student.getId();
        String name = student.getName();
    }
}
