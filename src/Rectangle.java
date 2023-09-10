public class Rectangle {
    // Attributes
    public double length;
    private double width;
    
    // Setter
    public void setLength(double l) {
        length = l;
    }
    public void setWidth(double w) {
        width = w;
    }
    
    // Getter
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
