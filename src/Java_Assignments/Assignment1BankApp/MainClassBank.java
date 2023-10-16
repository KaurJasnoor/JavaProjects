package Java_Assignments.Assignment1BankApp;

public class MainClassBank {
    public static void main(String[] args) {
        BankApp bankApp = new BankApp();
        bankApp.welcome();
        BankApp.intialBalance(1000);
        bankApp.mainMenu();
    }
}
