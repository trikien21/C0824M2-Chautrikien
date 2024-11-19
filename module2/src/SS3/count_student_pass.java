package SS3;
import java.util.Scanner;
public class count_student_pass {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input a size of array: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Size should not exceed 30");
            }
        } while (size > 30);

        array = new int[size];
        for(int i=0; i < size; i++){
            System.out.printf("Input a mark for student[%d]: \n", i);
            array[i]= scanner.nextInt();
        }

        int count = 0;
        System.out.printf("List of mark: \n");
        for(int i=0; i < size; i++){
            System.out.printf("Student[%d]: %d\n", i, array[i]);
            if(array[i] >= 5 && array[i] <= 10){
                count++;
            }
        }
        System.out.printf("The number of student passing the exam is %d", count);
    }
}
