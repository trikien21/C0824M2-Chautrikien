package SS2;
import java.util.Scanner;

public class Interest {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int month;
        double money;
        double interestRate;

        System.out.println("Input investment amount: ");
        money= scanner.nextDouble();
        System.out.println("Input number of months: ");
        month= scanner.nextInt();
        System.out.println("Input annual interest rate in");
        interestRate= scanner.nextDouble();
        double totalInterest= 0;
        for(int i=0; i<month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.printf( "total of interest: %.2f", totalInterest);
    }
}
