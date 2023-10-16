package Java_Practice.Oct10.Inheritence.Oct14.Aggregation;

public class MainAggregation {
    public static void main(String[] args) {
        Address address = new Address("Archdekin Dr", "Brampton", "Ontario", "Canada","L5T0A1");
        Employee employee = new Employee(301, "Jasnoor", 12000, address);

        employee.displayEmployee();
       // address.displayAddress();

    }
}
