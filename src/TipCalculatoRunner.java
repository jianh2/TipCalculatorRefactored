import java.util.Scanner;

public class TipCalculatoRunner {
    {

        int people;
        double bill;
        double tipPercent;
        double totalTip =;
        // These variables will store the data based on the user's input to the number of people, tip, and the initial bill.


        Scanner scan = new Scanner(System.in);

        System.out.println("What is your total bill?");

        bill = scan.nextDouble();

        System.out.println("What is the total number of people in your party");

        people = scan.nextInt();

        TipCalculator tip = new TipCalculator(people,bill);

        System.out.println("What is the tip percentage that you would like to pay");

        totalTip = scan.nextDouble();

        System.out.println("Your total bill before tip is" tip.getTotalBillBeforeTip());

        double totalBill = bill + totalTip;

        double tipPerPerson = totalTip / people;

        double totalBillPerPerson = totalBill / people;

        // Lines 21-24 will calculate the final bill per person as well as the tip per person

        System.out.println("The total amount of tip is " + totalTip +  "$"+  "Your total bill is " + totalBill +  "$." + " The tip per person is " + tipPerPerson + "$");
        System.out.println("Your final bill is " + totalBill + " and the bill per person is " + totalBillPerPerson);










    }
}