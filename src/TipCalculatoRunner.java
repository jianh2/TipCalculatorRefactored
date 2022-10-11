import java.util.Scanner;

public class TipCalculatoRunner {
    {

        int people;
        double bill;
        double tipPercent;
        double totalTip ;
        // These variables will store the data based on the user's input to the number of people, tip, and the initial bill.


        Scanner scan = new Scanner(System.in);

        System.out.println("What is your total bill?");

        bill = scan.nextDouble();



        System.out.println("What is the total number of people in your party");

        people = scan.nextInt();

        System.out.println("What is the tip percentage that you would like to pay");

        totalTip = scan.nextDouble();


        System.out.println("Enter a cost in dollars and cents, e.g. 12.50(-1 to end): ");

        double cost1 = scan.nextDouble();

        TipCalculator tip = new TipCalculator(people,bill);

        tip.addMeal(bill);

        if (cost1 > -1) {
            System.out.println("--------------");
            System.out.println("total bill before tip" + tip.getTotalBillBeforeTip());
            System.out.println("Total Tip Percentage: " + tip.getTipPercentage());
            System.out.println("Total Tip" + tip.tipAmount());
            System.out.println("Total Bill With Tip:" + tip.totalBill());
            System.out.println("Per person cost Before Tip" + tip.getTotalBillBeforeTip() / 1);
            System.out.println("Tip per person :" + tip.tipAmount()/1);
            System.out.println("cost per person:" + tip.totalBill()/1);

        }

        System.out.println("Enter a cost in dollars and cents, e.g. 12.50(-1 to end): ");

        double cost2 = scan.nextDouble();

        tip.addMeal(bill);

        if (cost1 > -1) {
            System.out.println("--------------");
            System.out.println("total bill before tip" + tip.getTotalBillBeforeTip());
            System.out.println("Total Tip Percentage: " + tip.getTipPercentage());
            System.out.println("Total Tip" + tip.tipAmount());
            System.out.println("Total Bill With Tip:" + tip.totalBill());
            System.out.println("Per person cost Before Tip" + tip.getTotalBillBeforeTip() / 2);
            System.out.println("Tip per person :" + tip.tipAmount()/2);
            System.out.println("cost per person:" + tip.totalBill()/2);

        }

        System.out.println("Enter a cost in dollars and cents, e.g. 12.50(-1 to end): ");

        double cost3 = scan.nextDouble();

        tip.addMeal(bill);

        if (cost1 > -1) {
            System.out.println("--------------");
            System.out.println("total bill before tip" + tip.getTotalBillBeforeTip());
            System.out.println("Total Tip Percentage: " + tip.getTipPercentage());
            System.out.println("Total Tip" + tip.tipAmount());
            System.out.println("Total Bill With Tip:" + tip.totalBill());
            System.out.println("Per person cost Before Tip" + tip.getTotalBillBeforeTip() / 3 );
            System.out.println("Tip per person :" + tip.tipAmount()/3);
            System.out.println("cost per person:" + tip.totalBill()/3);

        }

        System.out.println("Enter a cost in dollars and cents, e.g. 12.50(-1 to end): ");

        double cost4 = scan.nextDouble();

        tip.addMeal(bill);

        if ( cost1 > -1)  {
            System.out.println("--------------");
            System.out.println("total bill before tip" + tip.getTotalBillBeforeTip());
            System.out.println("Total Tip Percentage: " + tip.getTipPercentage());
            System.out.println("Total Tip" + tip.tipAmount());
            System.out.println("Total Bill With Tip:" + tip.totalBill());
            System.out.println("Per person cost Before Tip" + tip.getTotalBillBeforeTip() / 4 );
            System.out.println("Tip per person :" + tip.tipAmount()/4);
            System.out.println("cost per person:" + tip.totalBill()/4);

        }

        System.out.println("Enter a cost in dollars and cents, e.g. 12.50(-1 to end): ");

        double cost5 = scan.nextDouble();

        tip.addMeal(bill);

        if ( cost1 > -1)  {
            System.out.println("--------------");
            System.out.println("total bill before tip" + tip.getTotalBillBeforeTip());
            System.out.println("Total Tip Percentage: " + tip.getTipPercentage());
            System.out.println("Total Tip" + tip.tipAmount());
            System.out.println("Total Bill With Tip:" + tip.totalBill());
            System.out.println("Per person cost Before Tip" + tip.getTotalBillBeforeTip() / 5 );
            System.out.println("Tip per person :" + tip.tipAmount()/5);
            System.out.println("cost per person:" + tip.totalBill()/5);

        }

        System.out.println("Enter a cost in dollars and cents, e.g. 12.50(-1 to end): ");

        double cost6 = scan.nextDouble();

        tip.addMeal(bill);

        if ( cost1 > -1)  {
            System.out.println("--------------");
            System.out.println("total bill before tip" + tip.getTotalBillBeforeTip());
            System.out.println("Total Tip Percentage: " + tip.getTipPercentage());
            System.out.println("Total Tip" + tip.tipAmount());
            System.out.println("Total Bill With Tip:" + tip.totalBill());
            System.out.println("Per person cost Before Tip" + tip.getTotalBillBeforeTip() / 6 );
            System.out.println("Tip per person :" + tip.tipAmount()/6);
            System.out.println("cost per person:" + tip.totalBill()/6);
        }













    }
}