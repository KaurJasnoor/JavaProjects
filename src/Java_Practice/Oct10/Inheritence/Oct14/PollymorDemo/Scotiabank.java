package Java_Practice.Oct10.Inheritence.Oct14.PollymorDemo;

public class Scotiabank extends Bank {

    public float interestRate;
    public int totalAmount;
    public int numOfDays;

    public Scotiabank(float interestRate, int totalAmount, int numOfDays) {
        this.interestRate = interestRate;
        this.totalAmount = totalAmount;
        this.numOfDays = numOfDays;
    }

    @Override
    public float calcInterestRate() {
        float result = interestRate*totalAmount*numOfDays;
        return result;
    }
}
