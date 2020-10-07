package LabSheetWeek1;

import javax.swing.*;

public class Exercise4 {
    public static void main(String args[])
    {
        final float lowerRate = 1.75f;
        final float upperRate = 2.50f;
        String name;
        String distanceTravelledAsString;
        float totalAmountDue;

        name = JOptionPane.showInputDialog("Please enter your name");
        distanceTravelledAsString = JOptionPane.showInputDialog("Please enter the number of km cycled");

        int distanceTravelled = Integer.parseInt(distanceTravelledAsString);

        if(distanceTravelled > 10)
        {
            totalAmountDue = ((distanceTravelled-10)*upperRate) + (lowerRate*10);
                    JOptionPane.showMessageDialog(null,"Name: " + name +
                        "\nDistance cycled: " + distanceTravelled +
                        "\nSponsorship amount due: €" + String.format("%.2f",totalAmountDue),
                    "Receipt",JOptionPane.INFORMATION_MESSAGE);

            System.exit(0);
        }
        else

            totalAmountDue = distanceTravelled*lowerRate;

                    JOptionPane.showMessageDialog(null,"Name: " + name +
                            "\nDistance cycled: " + distanceTravelled +
                            "\nSponsorship amount due: €" + String.format("%.2f",totalAmountDue),
                    "Receipt",JOptionPane.INFORMATION_MESSAGE);

            System.exit(0);

    }
}
