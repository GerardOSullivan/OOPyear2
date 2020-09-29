package LabSheetWeek2;

import javax.swing.JOptionPane;

public class Exercise1 {
    public static void main(String args[]) {
        int numberOfLoopsProcessed = 0;
        double totalHardDriveSpace = 0;
        double lowestPrice = 0;
        double highestPrice = 0;
        String cheapestProcessor = "";
        String serialNumber = JOptionPane.showInputDialog("Please enter the serial number (<CR> to exit)");

        while (!serialNumber.equals("")) {
            String hardDiskAsString = JOptionPane.showInputDialog("Please enter the hard-disk space");

            boolean validHardDrive = false;
            while (!validHardDrive) {

                int validDigits = 0;

                for (int i = 0; i < hardDiskAsString.length(); i++) {
                    if (Character.isDigit(hardDiskAsString.charAt(i))) {
                        validDigits++;
                    } else {
                        break;
                    }
                }


                if (validDigits == hardDiskAsString.length()) {
                    int hardDisk = Integer.parseInt(hardDiskAsString);
                    if (hardDisk >= 50 && hardDisk <= 5000) {
                        validHardDrive = true;
                        totalHardDriveSpace += hardDisk;

                    } else {
                        hardDiskAsString = JOptionPane.showInputDialog("Invalid!!!Please re-enter hard-disk space");
                    }

                } else {
                    hardDiskAsString = JOptionPane.showInputDialog("Invalid!!!Please re-enter hard-disk space");
                }
            }
            String processorType = JOptionPane.showInputDialog("Please enter the processor type");
            String price = JOptionPane.showInputDialog("Please enter the price");

            if (numberOfLoopsProcessed == 0) {
                cheapestProcessor = processorType;
                lowestPrice = Double.parseDouble(price);
                highestPrice = Double.parseDouble(price);

            } else {
                if (lowestPrice > Double.parseDouble(price)) {
                    cheapestProcessor = processorType;
                    lowestPrice = Integer.parseInt(price);
                }

                if (highestPrice < Double.parseDouble(price)) {
                    highestPrice = Double.parseDouble(price);
                }
            }
            numberOfLoopsProcessed++;

            serialNumber = JOptionPane.showInputDialog("Please enter the serial number (<CR> to exit)");


        }
        if (numberOfLoopsProcessed != 0) {
            JOptionPane.showMessageDialog(null, "The average disk space available on the computers processed is : " + String.format("%.0f",averageDiskSpace(totalHardDriveSpace, numberOfLoopsProcessed)) +"GB" +
                    "\nThe price range of the computers is from €" + lowestPrice + " to €" + highestPrice +
                    "\nThe processor type on the cheapest computer is " + cheapestProcessor, "Computer Stats", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No valid Entries were found exiting Program", "Computer Stats", JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0);
    }


    public static double averageDiskSpace(double totalHardDriveSpace, int numberProcessed) {
        return totalHardDriveSpace/numberProcessed;
    }
}
