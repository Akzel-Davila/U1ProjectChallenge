import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Total Bill
        System.out.println("Welcome to the tip Calculator!");
        System.out.print("How much was the total bill?: ");
        double originalBill = Double.parseDouble(s.nextLine());
        //Percentage is inputted and calculations are done
        System.out.print("What percent would you like to tip? ");
        double tipPercent = Double.parseDouble(s.nextLine());
        //Party Amount is asked for and calculations regarding amount per person and total bill are done
        System.out.print("How many people are in your party? ");
        int partyAmount = Integer.parseInt(s.nextLine());
        TipCalculator calculator = new TipCalculator(partyAmount, tipPercent, originalBill);
        double billWithTip = calculator.getBillWithTip();
        double totalTipAmount = calculator.totalTipAmount(billWithTip);
        double tipPerPerson = calculator.getTipPerPerson(totalTipAmount);
        double personTotal = calculator.getPersonTotal(tipPerPerson);
        //Print statements are done
        System.out.print("The total tip amount is $" );
        System.out.format("%.2f", totalTipAmount);
        System.out.println();
        System.out.print("The total bill including tip is $");
        System.out.format("%.2f", billWithTip);
        System.out.println();
        System.out.print("The tip per person is $");
        System.out.format("%.2f", tipPerPerson);
        System.out.println();
        System.out.print("The total per person is ");
        System.out.format("%.2f", personTotal);
        System.out.println();



    }
}