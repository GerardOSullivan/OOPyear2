package LabSheet5.exercise3;

public class BankAccount {
    private String owner;
    private int number;
    private static double interestRate;
    private static int count=0;

    public BankAccount()
    {
        owner="Owner not Available";
        interestRate=0;
        incrementAccountNumber();
        setNumber(count);
    }

    public BankAccount(String owner,int userNumber,double interestRate)
    {
        this.owner=owner;
        this.interestRate=interestRate;
        incrementAccountNumber();
        setNumber(count);

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

    private void setNumber(int number) { this.number = number; }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    private static void incrementAccountNumber() { count++; }

    @Override
    public String toString() {
        return "Owner: " + getOwner() + "    Account Number: " + getNumber() + "     Interest Rate: " + String.format("%.1f",getInterestRate());
    }
}
