package Java_Assignments.Inheritence;

public class Chair extends Furniture{
    String shapeOfChair;

    public Chair(){

    }
    public Chair(int numOfLegs, String material, String shapeOfChair) {
        super(numOfLegs, material);
        this.shapeOfChair = shapeOfChair;
    }

    public void displayChair(){
        System.out.println("Shape of the Chair: "+shapeOfChair);
        System.out.println("No of legs: "+numOfLegs);

    }
}
