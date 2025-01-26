public class Constructor
{
    String title;
    String author;
    double price;
    String barcode;
    public Constructor()
    {
        this.title = "any";
        this.author= "any";
        this.price= 759.54;
        this.barcode="fefew";
    }

    public Constructor(String title)
    {

        this.title = title;
    }

    public Constructor(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    public Constructor(String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Constructor(String title, String author, double price, String barcode)
    {
        this.title = title;
        this.author = author;
        this.price = price;
        this.barcode = barcode;
    }

    public void displayDetails(String title, String author, double price, String barcode)
    {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
        System.out.println(barcode);
    }
    public void displayDetails(String title, String author, double price)
    {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }
    public void displayDetails(String title, String author)
    {
        System.out.println(title);
        System.out.println(author);
    }
    public void displayDetails(String title)
    {
        System.out.println(title);
    }
    public void displayDetails()

    {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
        System.out.println(barcode);
    }
}
