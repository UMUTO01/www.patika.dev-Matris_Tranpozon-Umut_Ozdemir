import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        int[][] matrix2x3 = {
                {1, 2, 3},
                {4, 5, 6}
        };


        int[][] transposeMatrix = new int[3][2];


        for (int i = 0; i < matrix2x3.length; i++) {
            for (int j = 0; j < matrix2x3[i].length; j++) {
                transposeMatrix[j][i] = matrix2x3[i][j];
            }
        }


        System.out.println("Transposed Matrix (3x2):");
        for (int i = 0; i < transposeMatrix.length; i++) {
            for (int j = 0; j < transposeMatrix[i].length; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}