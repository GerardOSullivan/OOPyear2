package LabSheet2;

import javax.swing.*;

public class Exercise4 {
    public static void main (String args[])
    {
        double numberArray[]= {22.3,45.6,27.4,56.5,73.2,11.5,87.4,23.8};

        JOptionPane.showMessageDialog(null,"The largest value in the array is " + largest(numberArray),"Array Stats",JOptionPane.INFORMATION_MESSAGE);
    }

    public static double largest(double numberArray[])
    {
        double largest=0;
        for(int i = 0;i < numberArray.length;i++)
        {
          if(numberArray[i]>largest)
          {
              largest=numberArray[i];
          }
        }

        return largest;
    }

    
}
