package LabSheet1;

import javax.swing.*;

public class Exercise7 {
    public static void main(String args[]) {
        int n = 1;
        double totalAmountOfWords = 0;
        String shortestText = "";

        do {
            String text = JOptionPane.showInputDialog("Please enter a piece of text " + n);
            int characterCounter = 0;
            int lowerCaseVowels = 0;
            int wordCounter = 1;
            int edCounter = 0;
            boolean firstLetterE = false;

            if (n == 1) {
                shortestText = text;
            }

            for (int i = 0; i < text.length(); i++) {
                char currentCharacter = text.charAt(i);

                if (currentCharacter != ' ') {
                    characterCounter++;
                }

                if (currentCharacter == 'a' || currentCharacter == 'e' || currentCharacter == 'i' || currentCharacter == 'o' || currentCharacter == 'u') {
                    lowerCaseVowels++;
                }

                if (currentCharacter == ' ') {
                    wordCounter++;
                }

                if (firstLetterE) {
                    if (currentCharacter == 'd') {
                        firstLetterE = false;
                        edCounter++;
                    }
                }

                if (currentCharacter == 'e') {
                    firstLetterE = true;
                }

            }

            if (text.length() < shortestText.length()) {
                shortestText = text;
            }

            totalAmountOfWords += wordCounter;


            JOptionPane.showMessageDialog(null, "         *****Text Data*****\n" +
                    "\nNumber of Characters: " + characterCounter +
                    "\nNumber of lowercase vowels: " + lowerCaseVowels +
                    "\nNumber of words: " + wordCounter +
                    "\nNumber of times 'ed' appears in the text: " + edCounter, "Text Data", JOptionPane.INFORMATION_MESSAGE);

            n++;

        } while (n != 4);

        JOptionPane.showMessageDialog(null, "        *****Overall Results*****\n" +
                "\nShortest piece of text: " + shortestText +
                "\nAverage Number of Words: " + String.format("%.0f", totalAmountOfWords / 3), "Overall Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
