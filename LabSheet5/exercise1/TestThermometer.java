package LabSheet5.exercise1;

import javax.swing.*;

public class TestThermometer {

   public static void testThermometer(){
        String output = "*****Thermometer Testing*****\n\n";

        Thermometer t1 = new Thermometer(35);

        output += "Calling the single-argument constructor .... setting the temperature of first thermometer to " + t1.getCurrentTemperature() + "C\n" +
                    "First Thermometer:\n" +
                    t1.toString()+ "\n\n\n";

        Thermometer t2 = new Thermometer();

        output += "Calling the no-argument constructor .... setting the temperature of second thermometer to " + t2.getCurrentTemperature() + "C\n" +
                "Second Thermometer:\n" +
                t2.toString() + "\n\n\n";

        t2.setCurrentTemperature(25);

        output += "Calling the setTemperature() constructor .... setting the temperature of second thermometer to " + t2.getCurrentTemperature() + "C\n" +
                "Second Thermometer:\n" +
                t2.toString()+ "\n\n\n";

        JOptionPane.showMessageDialog(null,output,"",JOptionPane.INFORMATION_MESSAGE);

        String userInput = JOptionPane.showInputDialog("Please enter the current temperature of the first thermometer:");

        t1.setCurrentTemperature(Integer.parseInt(userInput));

        output="*****Thermometer Testing*****\n\nCalling the setTemperature() constructor .... setting the temperature of first thermometer to " + t1.getCurrentTemperature() + "C\n" +
                "First Thermometer:\n" +
                t1.toString()+ "\n\n\n";

        JOptionPane.showMessageDialog(null,output,"",JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main (String args [])
    {
        testThermometer();
    }
}
