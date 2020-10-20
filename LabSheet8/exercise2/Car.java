package LabSheet8.exercise2;

public class Car extends Vehicle {
    private int maxPassengers;
    private String registrationNumber;

    public Car(){
        maxPassengers=0;
        registrationNumber="No registration number specified";
    }

    public Car(double price,double length,double height,double weight,String manufacturer,String model,int maxPassengers,String registrationNumber){
        super(price, length, height, weight, manufacturer, model);
        this.maxPassengers=maxPassengers;
        setRegistrationNumber(registrationNumber);
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if(Validator.isValidRegistrationNumber(registrationNumber))
        {
            this.registrationNumber = registrationNumber;
        }
        else
        {
            this.registrationNumber ="Invalid Registration Number";
        }
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String toString() {
        return super.toString() +
                "\nMax passengers: " + getMaxPassengers() +
                "\nRegistration Number: " + getRegistrationNumber();
    }
}
