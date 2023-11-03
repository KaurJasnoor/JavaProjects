package Java_Assignments.interfaceAssignment.problem1;

public class Penguin implements Animal, Swimmable{
    @Override
    public void feed() {
        System.out.println("Penguin eating fish");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin making sound ");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}

