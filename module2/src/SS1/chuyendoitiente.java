package SS1;
import java.util.Scanner;
public class chuyendoitiente {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input USD: ");
        int USD= scanner.nextInt();

        double VND= USD * 23000;
        System.out.println(USD + " to " + VND);

    }
}
