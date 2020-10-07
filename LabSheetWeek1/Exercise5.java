package LabSheetWeek1;

import javax.swing.*;

public class Exercise5 {
    public static void main(String args[])
    {
        final double earthsGravity= 9.81;
        String massOfEarthAsString = JOptionPane.showInputDialog("Please enter the mass of planet Earth: ");
        String radiusOfEarthAsString = JOptionPane.showInputDialog("Please enter the radius of planet Earth: ");
        String massOfOtherPlanetAsString = JOptionPane.showInputDialog("Please enter the mass of the other planet: ");
        String radiusOfOtherPlanetAsString = JOptionPane.showInputDialog("Please enter the radius of the other planet: ");

        double massOfEarth = Double.parseDouble(massOfEarthAsString);
        double radiusOfEarth = Double.parseDouble(radiusOfEarthAsString);
        double massOfOtherPlanet = Double.parseDouble(massOfOtherPlanetAsString);
        double radiusOfOtherPlanet = Double.parseDouble(radiusOfOtherPlanetAsString);

        double gravityOfOtherPlanet = ((earthsGravity*massOfOtherPlanet*(Math.pow(radiusOfEarth,2)))/(massOfEarth*(Math.pow(radiusOfOtherPlanet,2))));

        JOptionPane.showMessageDialog(null,"The acceleration due to gravity on the other planet is " + String.format("%.2f",gravityOfOtherPlanet) +" m/s/s","Results",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }
}
