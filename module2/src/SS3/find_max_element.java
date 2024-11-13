package SS3;
import java.util.Scanner;
public class find_max_element {
    public static void main(String[] args){
        int size;
        int array[];
        Scanner scanner= new Scanner(System.in);
        do{
            System.out.print("Input a size: ");
            size = scanner.nextInt();
            if(size > 20){
                System.out.println("Size should not exceed 20");
            }
        }while (size > 20);

        array= new int[size];
        System.out.println("Input array: ");
        for(int i=0; i < size; i++){
            System.out.printf("Array[%d]: ", i);
            array[i] = scanner.nextInt();
        }

        System.out.println("Array: ");
        for(int i=0; i < size; i++){
           System.out.printf("Array[%d]: %d\n", i, array[i]);
        }

        int max= array[0];
        int index=-1;
        for(int i=0; i < size; i++){
            if(array[i] > max){
                max = array[i];
                index = i;
            }
        }
        System.out.printf("The largest property value in the list is %d at %d", max, index);
    }
}
