public class Square {
    private double length;
    private double width;
    
    public Square(){}
    
    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public void setLength(double length) {
        length = 100;
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
    
    // Take Object As A Prameter
    public void modifyObject(Square s) {
        s.length = 500;
        s.width = 5;
    }
    
    // Return Object
    public Square add(Square s2) {
        Square result = new Square();
        result.length = this.length + s2.length;
        result.width = this.width + s2.width;
        return result;
    }
    
    // Comparing Objects
    public boolean isEqualTo(Square s2) {
        if(this.length == s2.length && this.width == s2.width) {
            return true;
        } else {
            return false;
        }
    }
    
    // Deep Copy
    public Square(Square sourceSquare) {
        length = sourceSquare.length;
        width = sourceSquare.width;
    }
}
