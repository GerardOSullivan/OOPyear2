package LabSheet1;

import javax.swing.*;

public class Exercise1 {
    public static void main(String args[])
    {
        String a ="hello world OOP";
        String name;

        name = JOptionPane.showInputDialog("Hey can you please enter your name please:");

        if( name.equals("Gerard"))
        {
            JOptionPane.showMessageDialog(null,"O hello " + name,"O its you", JOptionPane.INFORMATION_MESSAGE);
        }
        else

             JOptionPane.showMessageDialog(null,name,"Hello world", JOptionPane.INFORMATION_MESSAGE);

            System.exit(0);

    }
}
