package LabSheet4.exercise5;

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

    public Book(String title, double price, String ISBN, int pages)
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
        if(title.equals("") || title == null)
        {
            this.title = "No Valid Title Supplied";
        }
        else
            this.title = title;
    }

    public void setPrice(double price) {
        if(price<0 || price>50000)
        {
            this.price=0;
        }
        else
            this.price = price;
    }

    public void setISBN(String ISBN) {
        if(ISBN.equals("") || ISBN == null)
        {
            this.ISBN = "No Valid ISBN Supplied";
        }
        else
            this.ISBN = ISBN;
    }

    public void setPages(int pages){
        if(pages<0 || pages>4000)
        {
            this.pages=0;
        }
        else
            this.pages = pages;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + "   price: " + getPrice() +
                "   ISBN: " + getISBN() + "   pages: " + getPages();
    }
}
