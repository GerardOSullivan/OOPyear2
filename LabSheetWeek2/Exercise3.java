package LabSheetWeek2;

import javax.swing.*;

public class Exercise3 {
    public static void main (String args[])
    {

        String names[]=new String[5];
        String longestName="";
        int totalCharacters=0;
        populateArray(names);

        for(int i=0;i<names.length;i++)
        {
            if(names[i].length()>longestName.length())
            {
                longestName= names[i];
            }
        }

        System.out.print(totalCharacters);


    }
    public static void populateArray(String names[])
    {
        for(int i=0;i< names.length;i++)
        {
            names[i]= JOptionPane.showInputDialog("Please enter the name of person " + (i+1));
        }
    }
}
