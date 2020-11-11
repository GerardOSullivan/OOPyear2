package LabSheet11.exercise1;

//TestComputer.java
/*A driver class for the Computer class that uses a for-each loop*/

public class TestComputer {
    public static void main(String[] args) {

        double totalPrice=0;
        String priceGreaterThan500="";
        String isTablet="";
        Computer highestSpeedComputer;

        Computer c1 = new Computer();
        Computer c2 = new Computer("Dell","Laptop",3.25,16,550.99);
        Computer c3 = new Computer("Apple","Tablet",3.65,8,500.25);
        Computer c4 = new Computer("Sun","Server",4.25,32,1768.45);
        Computer c5 = new Computer("Lenovo","Desktop",2.86,14,457.34);

        Computer allComputers[] = {c1,c2,c3,c4,c5};

        highestSpeedComputer = allComputers[0];

        System.out.println("\n\nDetails of all Computers in the array\n");
        for (Computer b:allComputers) {
            totalPrice += b.getPrice();

            if(b.getSpeed()>highestSpeedComputer.getSpeed())
            {
                highestSpeedComputer = b;
            }

            if(b.getPrice()>=500)
            {
                priceGreaterThan500+=b +"\n";
            }

            if(b.getType()=="Tablet")
            {
                isTablet+=b + "\n";
            }

            System.out.println(b);
        }

        System.out.println("\n\nSome additional information\n\nAverage computer price is: €" + String.format("%.2f",totalPrice/allComputers.length)+
                           "\nDetails of highest speed computer: " + highestSpeedComputer + "\n" +
                           "\nDetails of computers over €500: \n" + priceGreaterThan500 + "\n" +
                           "\nDetails of computers which are type Tablet: \n" + isTablet + "\n" +
                           "\nThe updated computer list after Dell acquires Lenovo: \n\n");

        for(Computer a:allComputers)
        {
            if(a.getManufacturer()=="Lenovo")
            {
                a.setManufacturer("Dell");
            }

            System.out.println(a);
        }
    }
}
