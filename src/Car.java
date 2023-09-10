public class Car {
    private String maker;
    private int year_model;
    
    public void setMaker(String maker) {
        this.maker = maker;
    }
    
    public void setYearModel(int year_model) {
        if(year_model < 2010) {
            System.out.println("The Model Year Is Un Available");
        } else {
            this.year_model = year_model;
        }
    }
    
    public String getMaker() {
        return maker;
    }
    public int getYearModel() {
        return year_model;
    }
    public void printData() {
        System.out.println("The Maker Is " + maker);        
        System.out.println("Year Model Is " + year_model);
    }
    
}
