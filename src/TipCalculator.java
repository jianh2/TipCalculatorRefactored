import java.util.Scanner;

public class TipCalculator {
    private int numPeople;
    private double tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator(int numPeople, double tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;

    }

    public double getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    public double tipAmount() {
        return (tipPercentage + 1) * (totalBillBeforeTip) - totalBillBeforeTip;
    }

    public double totalBill() {
        return totalBillBeforeTip * (1 + tipPercentage);
    }

    public double perPersonCostBeforeTip()
    {
        return totalBillBeforeTip / numPeople;
    }

    public double perPersonTipAmount()
    {
        return tipAmount() / numPeople;
    }

    public double perPersonTotalCost()
    {
        return totalBill() / numPeople;
    }


        }




