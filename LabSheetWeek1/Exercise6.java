package LabSheetWeek1;

import javax.swing.*;

public class Exercise6 {
    public static void main(String args[])
    {
        int n = 0;
        final double GLOBAL_AVERAGE_HEIGHT=1.665;
        double height;
        double totalHeights=0;
        double smallestHeight=0;
        int numberOfHeightsBetween=0;
        int numberOfHeightsAboveAverage=0;
        String heightAsString;

        while(n!=6)
        {
            n++;

            heightAsString = JOptionPane.showInputDialog("Loop " + n + " - Please enter height: ");
            height = Double.parseDouble(heightAsString);


            if(height >= 0.5464 && height <=2.72)
            {
                if(n==1)
                {
                    smallestHeight=height;
                }
            }
            else
                {
                    boolean valid=false;

                    while(!valid)
                    {
                        heightAsString = JOptionPane.showInputDialog("Loop " + n + " - Height value invalid!!! Please re-enter height: ");
                        height = Double.parseDouble(heightAsString);

                        if(height >= 0.5464 && height <=2.72)
                        {
                            valid=true;

                            if(n==1)
                            {
                                smallestHeight=height;
                            }
                            
                        }

                    }

                }
            totalHeights+=height;

            if(height<smallestHeight)
            {
                smallestHeight=height;
            }

            if(height >= 1.3 && height <= 1.9)
            {
                numberOfHeightsBetween++;
            }

            if(height > GLOBAL_AVERAGE_HEIGHT)
            {
                numberOfHeightsAboveAverage++;
            }

        }


        JOptionPane.showMessageDialog(null,"The average of the heights entered is " + String.format("%.1f",totalHeights/n) + "m" +
                "\nThe smallest height entered is " + String.format("%.2f",smallestHeight) + "m" +
                "\nThe number of height values between 1.3m and 1.9m inclusive is " + numberOfHeightsBetween +
                "\nThe percentage of height values exceeding the global average height is " + String.format("%.2f",(double)numberOfHeightsAboveAverage/n*100f) + "%" ,"Height Statistics",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
