package Java_Practice.Oct10.Inheritence.Oct14.PollymorDemo;

public class RBCbank extends Bank{

    public int totalAmount = 1000;
    public float interestRate = 4.8f;

    public int numOfDays = 30;

    public RBCbank(int totalAmount, float interestRate, int numOfDays) {
        this.totalAmount = totalAmount;
        this.interestRate = interestRate;
        this.numOfDays = numOfDays;
    }

    @Override
    public float calcInterestRate() {
        float result = totalAmount*interestRate*numOfDays;
        return result;
    }

}
