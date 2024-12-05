package SS3;
import java.util.Scanner;
public class CombineArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input size of array 1: ");
        int size1= scanner.nextInt();
        int[] array1= new int[size1];

        System.out.println("Input array 1: ");
        for(int i=0; i < size1; i++){
            array1[i] = scanner.nextInt();
        }

        System.out.print("Input size of array 2: ");
        int size2= scanner.nextInt();
        int[] array2= new int[size2];

        System.out.println("Input array 2: ");
        for(int i = 0; i < size2; i++){
            array2[i]= scanner.nextInt();
        }

        int[] array3= new int[size1 + size2];
        for(int i=0; i <  size1; i++){
            array3[i]= array1[i];
        }

        for(int i=0; i < size2; i++){
            array3[size1 + i]= array2[i];
        }

        System.out.println("Array after combine: ");
        printArray(array3);
    }

    public static void printArray(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
