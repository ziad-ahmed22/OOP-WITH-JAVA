public class CD implements RetailItem, Displayable{
    private double price;
    private String title;
    
    public CD() {}
    
    public CD(double price, String title) {
        this.price = price;
        this.title = title;
    }
    
    // implements from Super Class RetailItem
    public double getItemPrice() {
        return price;
    }
    
    public String getTitle() {
        return title;
    }
    
     // implements from Super Class Displayable
    public void display() {
        System.out.println("The Store Name Is => " + store_name);
        System.out.println("Title => " + title);
        System.out.println("Price => " + price);
    }
}
