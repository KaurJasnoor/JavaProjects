package Java_Assignments.Assignment4.Prob1;

public class MainAssign4 {
    public static void main(String[] args) {
        int num1 = 42;
        int num2 = 13;
        Adder adder = new Adder();
        System.out.println("My superclass is : Arithmetic");
        System.out.println(num1+" "+num2+" "+ adder.add(num1,num2));
    }
}
