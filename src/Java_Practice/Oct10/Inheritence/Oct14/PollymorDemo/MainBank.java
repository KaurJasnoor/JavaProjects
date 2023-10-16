package Java_Practice.Oct10.Inheritence.Oct14.PollymorDemo;

public class MainBank {
    public static void main(String[] args) {
        Bank Scotiabank = new Scotiabank(3.5f, 500, 30);
        Bank rbc = new RBCbank(1000, 5.5f, 30);
        System.out.println("ScotiaBank Amount after adding interest: "+Scotiabank.calcInterestRate());
        System.out.println("RBC bank Amount after adding interest: "+rbc.calcInterestRate());
    }
}
