package SS3;
import java.util.Scanner;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6};
        int index;
        Scanner input= new Scanner(System.in);
        index= input.nextInt();

        arr = removeElement(arr, index);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] removeElement(int[] arr,int index ){
        if(index < 0|| index >= arr.length){
            return arr;
        }
        int [] newArr= new int[arr.length - 1];
        for(int i=0; i< index; i++){
            newArr[i]= arr[i];
        }

        for(int i= index + 1; i < arr.length; i++){
            newArr[i - 1]= arr[i];
        }
        return newArr;
    }


}
