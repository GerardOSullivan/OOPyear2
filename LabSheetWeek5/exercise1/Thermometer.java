package LabSheetWeek5.exercise1;

public class Thermometer {
    private int currentTemperature;
    private int maxTemperature;
    private int minTemperature;

    public Thermometer()
    {
        currentTemperature=0;
        maxTemperature=Integer.MIN_VALUE;
        minTemperature=Integer.MAX_VALUE;
    }

    public Thermometer(int userTemperature)
    {
        currentTemperature=userTemperature;
        maxTemperature=userTemperature;
        minTemperature=userTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
        updateMaxMinTemperature(currentTemperature);
    }

    private void updateMaxMinTemperature(int userInput) {
        if(userInput>maxTemperature)
        {
            maxTemperature=userInput;
        }

        if(userInput<minTemperature)
        {
            minTemperature=userInput;
        }
    }

    public String toString()
    {
        return "The current temperature: " + getCurrentTemperature() + "\nMaximum Temperature is: " + getMaxTemperature() + "\nMinimum Temperature : " + getMinTemperature();
    }

}
