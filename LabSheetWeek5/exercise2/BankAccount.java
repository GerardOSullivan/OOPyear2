package LabSheetWeek5.exercise2;

public class BankAccount {
    private String owner;
    private int number;
    private static double interestRate;

    public BankAccount()
    {
        owner="Owner not Available";
        number=0;
        interestRate=0;
    }

    public BankAccount(String owner,int number,double interestRate)
    {
        this.owner=owner;
        this.number=number;
        this.interestRate=interestRate;
    }

    public String getOwner() {
        return owner;
    }

    public int getNumber() {
        return number;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Owner: " + getOwner() + "    Account Number: " + getNumber() + "     Interest Rate: " + String.format("%.1f",getInterestRate());
    }
}
