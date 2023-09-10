public class Bus {
    private static int number_of_objects;
    
    public Bus() {
        number_of_objects++;    
    }
    
    public static void getNumberOfObjects() {
        System.out.println(number_of_objects);
    }
}
