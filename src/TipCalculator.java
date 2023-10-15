public class TipCalculator {
    private int people;
    private double tipPercent;
    private double totalBill;

    public TipCalculator(int people, double tipPercent, double totalBill) {
        this.people = people;
        this.tipPercent = tipPercent;
        this.totalBill = totalBill;
    }

    public double getBillWithTip() {
        double tipDecimal = (double) tipPercent / 100;
        double totalBillTip = (tipDecimal * totalBill) + totalBill;
        return totalBillTip;
    }
    public double totalTipAmount(double totalBillTip){
        return (totalBillTip - totalBill);
    }
    public double getTipPerPerson(double totalTipAmount){
        return totalTipAmount / people;
    }
    public double getPersonTotal(double tipPerPerson){
        double personTotal = (totalBill/people) + tipPerPerson;
        return personTotal;
    }
}
