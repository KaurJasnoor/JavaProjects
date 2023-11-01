package Java_Practice.Oct24.ExceptionDemo;


import java.sql.SQLOutput;

public class MainBankExceptionDemo {
    public static void main(String[] args) {
    Bank bank = new Bank();
    double deposit = bank.deposit(1000);
        System.out.println("Deposited: $"+deposit);

        double withdraw = 0;
        try{
            withdraw = bank.withdraw(2200);
        }
        catch (InsufficientBalanceException e){
            System.out.println(e);
        }
        System.out.println("Withdraw: $"+withdraw);

    }
}
