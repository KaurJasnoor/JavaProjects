package Java_Practice.Oct7.Opps.constructor;

public class CalculatorConst {
    private double num1, num2;

    public CalculatorConst(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void add(){
        double sum = num1 + num2;
        System.out.println("Sum is :" +sum);
    }
    public void subtract(){
        double sub = num1 - num2;
        System.out.println("Subtraction is :"+ sub);
    }
    public void multiply(){
        double mul = num1 * num2;
        System.out.println("Multiplication is :"+ mul);
    }
    public void divide(){
        double div = num1 / num2;
        System.out.println("Division is :"+ div);
    }
}
