package SS4;
import java.util. Scanner;
public class mainQuadraticEquation {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        double a, b ,c;
        System.out.println("Input a: ");
        a= input.nextDouble();
        System.out.println("Input b: ");
        b= input.nextDouble();
        System.out.println("Input c: ");
        c= input.nextDouble();

        QuadraticEquation qua= new QuadraticEquation(a, b, c);
        double delta= qua.getDiscriminant();
        if(delta < 0){
            System.out.println("The equation has no roots");
        }else if(delta == 0){
            System.out.println("The equation has one root: "+ qua.getRoot1());
        }else {
            System.out.println("The equation has two roots: "+ qua.getRoot2() + qua.getRoot1());
        }

    }
}
