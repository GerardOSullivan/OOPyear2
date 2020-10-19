package LabSheet8.exercise1;

import sun.security.util.Length;

public class Vehicle {
    private double price;
    private double length;
    private double height;
    private double weight;
    private String manufacturer;
    private String model;

    public Vehicle(){
        price =0.0;
        length =0.0;
        height = 0.0;
        manufacturer ="No manufacturer specified";
        model = "No model specified";
    }

    public Vehicle(double price,double length,double height,double weight,String manufacturer,String model){
        this.price=price;
        this.length=length;
        this.height=height;
        this.weight=weight;
        this.manufacturer=manufacturer;
        this.model=model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String toString() {
        return "\nPrice: " + getPrice() +
                "\nLength: " + getLength() +
                "\nHeight: " + getLength() +
                "\nWeight: " + getWeight() +
                "\nManufacturer: " + getManufacturer();
    }
}
