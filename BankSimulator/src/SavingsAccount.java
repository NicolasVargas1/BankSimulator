public class SavingsAccount {

    private double balance;
    private double monthlyInterest;

    public SavingsAccount () {
        balance = 0;
        monthlyInterest = 0.006;
    }

    public double getBalance() {
        return balance;
    }

    public double getMonthlyInterest() {
        return monthlyInterest;
    }

    public void consignAmount ( double pAmount ) {

        balance = balance + pAmount;

    }

    public void withdrawAmount ( double pAmount ) {

        balance = balance - pAmount;
    }

    public void UpdateBalancePerStepMonth () {

        balance *= monthlyInterest;
    }
}

