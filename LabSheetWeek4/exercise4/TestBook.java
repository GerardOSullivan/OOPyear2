package LabSheetWeek4.exercise4;

import javax.swing.*;
import java.awt.*;

public class TestBook {
    public static void main(String args[])
    {

        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);
        textArea.append(String.format("%-20s%-8s%-15s%-5s" ,"Title" ,"Price","ISBN","Pages"));

        Book favouriteBook = new Book();

        String userInput = JOptionPane.showInputDialog("Please enter the title of your favourite book");
        favouriteBook.setTitle(userInput);

        userInput = JOptionPane.showInputDialog("Please enter the price of your favourite book");
        double price = Double.parseDouble(userInput);
        favouriteBook.setPrice(price);

        userInput = JOptionPane.showInputDialog("Please enter the ISBN of your favourite book");
        favouriteBook.setISBN(userInput);

        userInput = JOptionPane.showInputDialog("Please enter the amount of pages of your favourite book");
        int pages= Integer.parseInt(userInput);
        favouriteBook.setPages(pages);

        textArea.append(String.format("\n\n%-20s%-8s%-15s%-5s" ,favouriteBook.getTitle() , String.format("%.2f",favouriteBook.getPrice()), favouriteBook.getISBN(),favouriteBook.getPages()));

        Book leastFavouriteBook = new Book();

        userInput = JOptionPane.showInputDialog("Please enter the title of your least favourite book");
        leastFavouriteBook.setTitle(userInput);

        userInput = JOptionPane.showInputDialog("Please enter the price of your least favourite book");
        price = Double.parseDouble(userInput);
        leastFavouriteBook.setPrice(price);

        userInput = JOptionPane.showInputDialog("Please enter the ISBN of your least favourite book");
        leastFavouriteBook.setISBN(userInput);

        userInput = JOptionPane.showInputDialog("Please enter the amount of pages of your least favourite book");
        pages= Integer.parseInt(userInput);
        leastFavouriteBook.setPages(pages);

        textArea.append(String.format("\n\n%-20s%-8s%-15s%-5s" ,leastFavouriteBook.getTitle() , String.format("%.2f",leastFavouriteBook.getPrice()), leastFavouriteBook.getISBN(),leastFavouriteBook.getPages()));

        JOptionPane.showMessageDialog(null,textArea,"Book Object Data",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
