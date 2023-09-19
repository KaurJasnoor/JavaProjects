public class Calculator {
    public static void main(String[] args){
        System.out.println("Welcome to my Calculator");
        char input = '-';
        double x = 10;
        double y = 20;
        if(input == '+'){
            double sum = x + y;
            System.out.println("Sum of x and y  "+ sum);
        }
        else if (input == '-'){
            double sub = x - y;
            System.out.println("Subtraction of x and y  "+ sub);
        }
        else if (input == '/'){
            double div = x / y;
            System.out.println("Div of x and y  "+ div);
        }

}
}
