package Java_Assignments.interfaceAssignment.problem1;

public class Monkey implements Animal, Climbable{
    @Override
    public void feed() {
        System.out.println("Monkey eating bananas");
    }

    @Override
    public void makeSound() {
        System.out.println("Monkeys are making noise...");
    }

    @Override
    public void climb() {
        System.out.println("Monkey climbing on a tree");
    }
}
