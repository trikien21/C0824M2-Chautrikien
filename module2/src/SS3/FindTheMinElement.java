package SS3;

import java.util.Scanner;

public class FindTheMinElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the number of row: ");
        int rows = input.nextInt();
        System.out.println("Input the number of col: ");
        int cols = input.nextInt();

        double[][] matrix = new double[rows][cols];
        System.out.println("Input elememts: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Matrix[%d][%d]: ", i, j);
                matrix[i][j] = input.nextDouble();
            }
        }

        double min= matrix[0][0];
        int rowMin= 0, colMin= 0;

        for(int i= 0; i < rows; i++){
            for(int j= 0; j < cols; j++){
                if(matrix[i][j] < min){
                    min= matrix[i][j];
                    rowMin= i;
                    colMin= j;
                }
            }
        }
        System.out.println("The min element is "+ min);
        System.out.printf("Vị trí: [%d][%d]", rowMin, colMin);


    }
}
