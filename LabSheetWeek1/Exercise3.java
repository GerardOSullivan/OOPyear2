package LabSheetWeek1;

import javax.swing.*;

public class Exercise3 {
    public static void main(String args[])
    {
        String name;
        String course;
        String numberOfSnacksString;
        int numberOfSnacks;
        int totalSnacks;

        name = JOptionPane.showInputDialog("Please enter your name");
        course = JOptionPane.showInputDialog("Please enter your course");
        numberOfSnacksString = JOptionPane.showInputDialog("How many snacks would you like?");

        numberOfSnacks = Integer.parseInt(numberOfSnacksString);
        totalSnacks = numberOfSnacks*2;

        JOptionPane.showMessageDialog(null,"Name: " + name +
                                                            "\nCourse: " + course +
                                                            "\nSnacks: " + numberOfSnacks +
                                                            "\nCost: €" + totalSnacks, "Receipt",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
