public class CDT {

    private double investedValue;
    private double monthlyInterest;
    private int apertureMonth;

    public CDT() {

        investedValue = 0;
        monthlyInterest = 0;
        apertureMonth = 0;

    }

    public double getMonthlyInterest() {
        return monthlyInterest;
    }

    public void Invested ( double pInvestedValue, double pMonthlyInterest, int pApertureMonth ){

        investedValue = pInvestedValue;
        monthlyInterest = pMonthlyInterest;
        apertureMonth = pApertureMonth;

    }

    public double CalculatePresentValue ( int pActualMonth ){

        int monthsElapsed = pActualMonth - apertureMonth;

        return (double) (investedValue + (monthsElapsed * monthlyInterest * investedValue));

    }

    public double Close ( int pActualMonth ) {

        double closeValue =  CalculatePresentValue(pActualMonth);

        investedValue = 0;
        monthlyInterest = 0;
        apertureMonth = 0;

        return closeValue;
    }
}
