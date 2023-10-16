package Java_Assignments.Inheritence;

public class Furniture {

    int numOfLegs = 4;
    String material;

    public Furniture(){

    }
    public Furniture(int numOfLegs, String material) {
        this.numOfLegs = numOfLegs;
        this.material = material;
    }

    public void displayFurniture(){
        System.out.println("No of legs "+numOfLegs);
        System.out.println("Furniture Material "+material);
    }

}
