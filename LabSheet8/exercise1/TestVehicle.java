package LabSheet8.exercise1;

public class TestVehicle {
    public static void main(String[] args) {
    Car car1 = new Car();
    System.out.println("Testing the Car no-arg constructor: \n" + car1.toString());

    Car car2 = new Car(100000,4.5,1.25,2000,"Ferrari","F2",2,"05KY1");
    System.out.println("\nTesting the Car multi-arg constructor: \n" + car2.toString());

    Bicycle bike1 =new Bicycle();
    System.out.println("\nTesting the Bicycle no-arg constructor: \n" + bike1.toString());

    Bicycle bike2 =new Bicycle(500,1.5,1,50,"Raleigh","Mountain Bike",true,4);
    System.out.println("\nTesting the Bicycle multi-arg constructor: \n" + bike2.toString());

    }
}
