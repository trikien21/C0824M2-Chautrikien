package SS3;

public class FindTheMaxElement1 {
    public static void main(String[] args){
        double[][] matrix= {
            {1.5, 2.5, 4,5},
            {3.5, 6.5, 0.5}
        };

        double max= matrix[0][0];
        int rowMax= 0, colMax= 0;

        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if (matrix[i][j] > max){
                    max= matrix[i][j];
                    rowMax= i ;
                    colMax= j ;
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong ma trận là: "+ max);
        System.out.println("Vị trí của phần tử: " +rowMax+ "  " + colMax);
    }
}