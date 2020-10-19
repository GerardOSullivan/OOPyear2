package LabSheet4.exercise3;

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;

    public Book(){
        title="Title Not Available";
        price=0.00;
        ISBN="ISBN Not Available";
        pages=0;
    }

    public Book(String title,double price,String ISBN,int pages)
    {
        this.title=title;
        this.price=price;
        this.ISBN=ISBN;
        this.pages=pages;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + "   price: " + getPrice() +
                "   ISBN: " + getISBN() + "   pages: " + getPages();
    }
}
