package SS3;
import java.util.Scanner;
public class AddElement {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.print("Input N: ");
        int N= scanner.nextInt();
        int[] arr= new int[N];

        System.out.println("Input Elements: ");
        for(int i = 0; i < N; i++){
            arr[i]= scanner.nextInt();
        }

        System.out.print("Nhập phần từ cần thêm: ");
        int X= scanner.nextInt();

        System.out.print("Nhập vị trí cần chèn: ");
        int index= scanner.nextInt();

        if(index < 0 || index >= arr.length){
            System.out.println("Không thể chèn vào trị trí");
        }
        else{
            arr= insertElement(arr, X, index);
            System.out.println("Array after add: ");
            printArray(arr);
        }

    }
    public static int[] insertElement(int[] arr, int X, int index){
        int[] newArr= new int[arr.length + 1];
        for(int i=0; i< index; i++){
            newArr[i] = arr[i];
        }
        newArr[index] = X;
        for(int i= index + 1; i < newArr.length; i++){
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

