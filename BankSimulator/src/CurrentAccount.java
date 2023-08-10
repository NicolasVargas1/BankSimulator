
public class CurrentAccount {

    private double balance;

    public CurrentAccount() {
        balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void consignAmount ( double pAmount ) {

        balance = balance + pAmount;

    }

    public void withdrawAmount ( double pAmount ) {

        balance = balance - pAmount;
    }

}
