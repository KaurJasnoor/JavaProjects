package Java_Practice.Oct21.Encapsulation;

public class Scotiabank extends Bank{
    public Scotiabank(String accountHolderName, String accountType, String accountNumber, double accountBalance) {
        super(accountHolderName, accountType, accountNumber, accountBalance);
    }
    public void statements(){
        System.out.println("Scotiabank Printing Statements....");
    }

}
