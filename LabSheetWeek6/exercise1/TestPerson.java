package LabSheetWeek6.exercise1;

import javax.swing.*;

public class TestPerson {
    public static void TestPerson()
    {
        String output = "******Person Class Tester*****\n\n";

        Person p1 = new Person();

        output += "Calling the person constructor ....." +
         "\nValue of first Person object is: " + p1.toString();

        String userInput1 = JOptionPane.showInputDialog("Please enter the first name of the second person");
        String userInput2 = JOptionPane.showInputDialog("Please enter the last name of the second person");

        Person p2 = new Person(userInput1,userInput2);

        output += "\n\nCalling the person(String, String) constructor after getting user-supplied values ....." +
                "\nValue of second Person object is: " + p2.toString();

        JOptionPane.showMessageDialog(null,output,"BankAccount Object Data",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

    public static void main(String args[])
    {
        TestPerson();
    }
}
