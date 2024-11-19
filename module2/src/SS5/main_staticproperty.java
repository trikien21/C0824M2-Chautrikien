package SS5;

public class main_staticproperty {
    public static void main(String[] args){
        static_property car1;
        car1 = new static_property("Mazda 3", "Skyactiv 3");
        System.out.println(static_property.numberofCar);
        static_property car2= new static_property("Mazda 6", "Skyaactiv 6");
        System.out.println(static_property.numberofCar);
    }
}
