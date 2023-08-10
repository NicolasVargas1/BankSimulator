public class BankSimulator {

    private String identificationCard;
    private String name;
    private int currentMonth;
    // estos nuevos atributos hacen parte de el simulador en general por eso los añadimos como atributos.
    private CurrentAccount current;
    private SavingsAccount savings;
    private CDT investment;


    public BankSimulator ( String pIdentificationCard, String pName ) {

        identificationCard = pIdentificationCard;
        name = pName;
        currentMonth = 1;
        // inicializacion de las cuentas.
        current = new CurrentAccount();
        savings = new SavingsAccount();
        investment = new CDT();


    }

    public String getIdentificationCard () {
        return identificationCard;
    }

    public String getName () {
        return name;
    }

    public CurrentAccount getCurrent () {
        return current;
    }

    public SavingsAccount getSavings () {
        return savings;
    }

    public CDT getInvest() {
        return investment;
    }

    public int getCurrentMonth () {
        return currentMonth;
    }

    public double CalculateTotalBalance () {

        return current.getBalance() + savings.getBalance() + investment.CalculatePresentValue(currentMonth);

    }

    public void CDTInvest ( double pAmount, double pMonthlyInterest ) {

        investment.Invested( pAmount, pMonthlyInterest, currentMonth );
    }

    public void consignCurrentAccount ( double pAmount ) {

        current.consignAmount( pAmount );

    }

    public void consingSavingsAccount ( Double pAmount ) {

        savings.consignAmount( pAmount );

    }

    public void withdrawCurrentAccount ( double pAmount ){

        current.withdrawAmount(pAmount);

    }

    public void withdrawSavingsAccount ( double pAmount ) {

        savings.withdrawAmount( pAmount );

    }

    public void advanceMonthSimulation () {

        currentMonth += 1;

        savings.UpdateBalancePerStepMonth();

    }

    public void CDTClose() {

        double closeValueCDT = investment.Close( currentMonth );

        current.consignAmount(closeValueCDT);
    }



}