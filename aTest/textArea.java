package aTest;

import javax.swing.*;
import java.awt.*;

public class textArea {
    public static void main(String[] args) {
        JTextArea textArea = new JTextArea();
        Font newFont = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(newFont);
        textArea.setText("hello");
        textArea.append(" world");
        JOptionPane.showMessageDialog(null,textArea,"hello",JOptionPane.INFORMATION_MESSAGE);
    }
}
