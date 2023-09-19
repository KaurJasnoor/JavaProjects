public class NestedIfStatement {
    public static void main(String[] args){
        int age = 25;
        boolean hasGLicense = true;
         if (age < 16){
             System.out.println("You are not eligible to drive a car");
         }
         else if (age <25 && hasGLicense){
             System.out.println("You can not drive on highways");
        }
         else if (age >=19 && age<=65){
             System.out.println("You are eligible to drive a car");
        }
         else if (age >65){
             System.out.println("You are not eligible to drive a car");
        }
    }
}
