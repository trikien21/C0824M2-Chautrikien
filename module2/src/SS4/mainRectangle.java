package SS4;
import java.util.Scanner;

public class mainRectangle {
    public static void main(String[ ] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Input the width: ");
        double width= input.nextDouble();
        System.out.print("Input the height: ");
        double height= input.nextDouble();

        class_rectangle rectangle= new class_rectangle(width, height);
        System.out.println("Your Rectangle \n"+rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
