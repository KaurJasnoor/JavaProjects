package Java_Practice.Oct10.Inheritence;

public class Car extends Vehicle{
    String engineType = "electrical";
    int noOfSeats = 5;
    int fuelCap;

    public Car(String model, String color, int fuelCap) {
        super(model, color, fuelCap);
    }


    public void displayCar(){
        //System.out.println("Car is ready for displaying");
        //System.out.println("Fuel capacity of Car: " + this.fuelCap);
        //System.out.println("Fuel capacity of Vehicle: " + super.fuelCap);
    }
}
