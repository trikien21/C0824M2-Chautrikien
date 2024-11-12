package SS2;
import java.util.Scanner;
public class greatest_CommonFactor {
    public static void main(String[] args) {
        int A;
        int B;
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        System.out.print("Input A: ");
        B = scanner.nextInt();
        System.out.println("Input B: ");

        A = Math.abs(A);
        B = Math.abs(B);
        if(A == 0 || B == 0){
            System.out.println("No greatest common factor");
        }
        while(A != B ){
            if(A > B)
                A= A-B;
            else
                B= B-A;
        }
        System.out.println("Greatest common factor: "+ A);
    }
}
