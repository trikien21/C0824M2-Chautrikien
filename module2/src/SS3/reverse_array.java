package SS3;
import java.util.Scanner;
public class reverse_array {
    public static void main(String[] args){
        int size;
        int array[];
        Scanner scanner= new Scanner(System.in);

        do{
            System.out.print("Input a size: ");
            size= scanner.nextInt();
            if(size > 20){
                System.out.println("Size does not exceed 20");
            }
            }while (size > 20);

        array= new int[size];
        for(int i=0; i < size; i++){
            System.out.printf("Input Array[%d]: ", i);
            array[i]= scanner.nextInt();
        }

        for(int i=0; i < size; i++){
            System.out.printf("Array[%d]: %d\n", i, array[i]);
        }

        for(int i=0; i < size/2 ; i++){
            int temp = array[i];
            array[i] = array[size-1-i];
            array[size-1-i] = temp;
        }
        System.out.print("Reverse array: \n");
        for(int i=0; i < size; i++){
            System.out.printf("Array[%d]: %d\n", i, array[i]);
        }
        }
}
