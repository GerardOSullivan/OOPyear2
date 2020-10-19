package LabSheet5.exercise2;
//TestAnimal.java
/*This program aims to test
    a bank account object using no argument and multi argument constructors
 */

import javax.swing.*;

public class TestBankAccount {
    public static void TestBankAccount()
    {
        BankAccount b1 = new BankAccount();

        String output = "Calling the no-argument Bank Account constructor.The first Bank Account object details are: \n\n" + b1.toString();

        BankAccount b2 = new BankAccount("Richy Rich",2342343,0.75 );
        output += "\n\nCalling the multi-argument Bank Account constructor.The second Bank Account object details are: \n\n" + b2.toString();

        output += "\n\nNow calling the setInterestRate() method to change the interest rate to 0.5. \n\n";
        b1.setInterestRate(0.5);
        output += "The first BankAccount object details are: \n\n" + b1.toString();

        output += "\n\nThe second BankAccount object details are: \n\n" + b2.toString();

        JOptionPane.showMessageDialog(null,output,"BankAccount Object Data",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

    public static void main(String args[])
    {
        TestBankAccount();
    }
}
