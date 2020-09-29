package LabSheetWeek3.exercise2;

import LabSheetWeek3.exercise1.Computer;

import javax.swing.*;

public class TestComputer {
    public static void main(String[] args) {
        String output = "";

        Computer c1 = new LabSheetWeek3.exercise1.Computer();

        output += "Calling the no-argument Computer constructor. " +
                "The first Computer object details are: \n\n" + c1.toString();

        Computer c2 = new Computer("Dell","Laptop",3.25,16,550.99);

        output += "\n\nCalling the multi-argument Computer constructor. " +
                "The second Computer object details are: \n\n" + c2.toString();

        Computer c3 = new Computer("Apple","Desktop",2.9,12,865.00);

        c3.setRAM(-8);

        output += "\n\nCalling the multi-argument Computer constructor. " +
                "The Third Computer object details are: \n\n" + c3.toString();

        JOptionPane.showMessageDialog(null,output,"Computer Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
