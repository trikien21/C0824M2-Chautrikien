package SS5;

public class static_property {
    private String name;
    private String engine;
    public static int numberofCar;
    public static_property(String name, String engine){
        this.name= name;
        this.engine= engine;
        numberofCar++;
    }
}
