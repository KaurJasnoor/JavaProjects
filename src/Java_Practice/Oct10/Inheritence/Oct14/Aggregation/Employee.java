package Java_Practice.Oct10.Inheritence.Oct14.Aggregation;

public class Employee {
    private int id;
    private String name;
    private double salary;

    private Address address;

    public Employee(int id, String name, double salary, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
    void displayEmployee(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
        System.out.println("Address : "+address);
    }
}
