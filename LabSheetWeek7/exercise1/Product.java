package LabSheetWeek7.exercise1;

//Product.java
/*A simple instantiable class definition for a Product*/

public class Product {
    private int id = 0;
    private static int count = 1000000;
    private String name;
    private String description;

    public Product(int id, String name, String description) {
        setName(name);
        setDescription(description);
        incrementNumber();
        setId(this.count);
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id =id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private static void incrementNumber(){
        count++;
    }

    public String toString() {
        return "Product details are as follows: id: " + getId() + "  name: " + name + "  description: " + description;
    }
}

