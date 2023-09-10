public class RectangleTwo {
    private double length;
    private double width;
    
    // Constructor
    public RectangleTwo(){
        System.out.println("I Am A RectangleTwo Constructor");
        length = 10;
        width = 20;
    }
    
    // Constructor  Overloading
    public RectangleTwo(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    
    public double getArea() {
        return length * width;
    }
}
