public class Demo1 {
    public static void main(String[] args){
        int age = 25;
        boolean hasGLicense = true;
        double bal = 0.07;

        if (age<19 && hasGLicense) {
            System.out.println("You can have BAL is 0.0");
        }
        else if (age>19 && hasGLicense && bal<=0.05){
            System.out.println("You can have BAL is 0.05");
        }
        else if (age>19 && hasGLicense && bal>0.05){
            System.out.println("You will be ticked");
        }
    }
}
