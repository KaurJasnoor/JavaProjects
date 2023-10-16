package Java_Practice.Oct10.Inheritence;

public class Vehicle {

    String model = "BMW";
    String color = "BLACK";
    int fuelCap = 500;

    public Vehicle(String model, String color, int fuelCap) {
        this.model = model;
        this.color = color;
        this.fuelCap = fuelCap;
    }

    public void display(){
        System.out.println("Vehicle Class display method");
        System.out.println("Model : "+model);
        System.out.println("Color : "+color);
        System.out.println("Fuel Capacity : "+fuelCap);
    }
}
