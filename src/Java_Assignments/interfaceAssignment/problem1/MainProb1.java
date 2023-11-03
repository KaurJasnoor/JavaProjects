package Java_Assignments.interfaceAssignment.problem1;

import Java_Practice.Oct17.Interfaces.MobilePhone;

public class MainProb1 {
    public static void main(String[] args) {
        //creating object reference of classes
        Lion lion = new Lion();
        Penguin penguin = new Penguin();
        Monkey monkey = new Monkey();

        // calling methods
        lion.feed();
        lion.makeSound();

        penguin.feed();
        penguin.makeSound();
        penguin.swim();

        monkey.feed();
        monkey.makeSound();
        monkey.climb();

    }
}
