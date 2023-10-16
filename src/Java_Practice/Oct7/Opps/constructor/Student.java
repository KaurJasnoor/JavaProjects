package Java_Practice.Oct7.Opps.constructor;

public class Student {
    int rollNo;
    String name;

    //Defult Constructor
    Student(){

    }

    //Single Parameterized Constructor
    Student(int r){
        rollNo = r;
    }

    //Double Parameterized Constructor
    Student(int r, String n){
        rollNo = r;
        name = n;
    }

    public void showStudent(){
        System.out.println("Roll No. " +rollNo + " and " + "Name is :"+name);
    }

}
