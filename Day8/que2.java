package Day8;

import java.sql.Array;
import java.util.Arrays;

public class que2 {
//    public static void main(String[] args)
//    {
//        int[][] values =
//                {
//                        { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }
//                };
//        for (int row = 0; row < 3; row++)
//        {
//            for (int col = 0; col < 3; col++)
//            {
//                System.out.print(values[row][col] + " ");
//            }
//
//            System.out.println();
//        }
//    }
public static int[] printColSum(int[][] matrix){
    int numRows = matrix.length;
    int numCols = matrix[0].length;
    int[] colSum = new int[numCols];
    for(int i = 0; i < numCols; i++)
    {
        int sum = 0;

        for(int j = 0; j < numRows; j++)
            if(matrix[j][i]%2==0){
                sum += matrix[j][i];
            }
        colSum[i] = sum;
    }
    return colSum;
}

    private static void printMatrix(int[][] matrix){
        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));
    }

    public static void main(String[] args){
        int matrix[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8 , 9}};

        printMatrix(matrix);
        System.out.println("The column sum even of the above matrix is as follows:");
        int[] colSum = printColSum(matrix);
        for(int i: colSum)
            System.out.println(i);
    }
}
