package Java_Practice.Oct7.Opps;

public class Main {
    public static void main(String[] args) {

        Computer hpComputer = new Computer();
        hpComputer.size = 19;
        hpComputer.color = "Gray";
        hpComputer.ramCapacity = 256;
        hpComputer.manufacturer = "HP";

        hpComputer.showComputer();

        Computer dellComputer = new Computer();
        dellComputer.size = 20;
        dellComputer.color = "Blue";
        dellComputer.ramCapacity = 500;
        dellComputer.manufacturer = "Dell";

        dellComputer.showComputer();

    }
}
