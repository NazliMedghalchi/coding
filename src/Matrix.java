import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import sun.invoke.empty.Empty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by nazlimedghalchi on 15-12-07.
 */


public class Matrix {
    int row;
    int col;
    public int[][] matrix;

    public Matrix(int r, int c) throws IOException {
        this.row = r;
        this.col = c;
        matrix = new int[row][col];
        System.out.println(matrix.length);

        System.out.println("Enter first Matrix: " +
                "(Use Space as separator and Enter to go next line)");
//      Read first Matrix
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Scanner scanner = new Scanner(System.in);
            int  i, j;
//        while (System.in.toString() != "*") {
            for (i = 0; i < matrix.length; i++) {
                for (j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
        }
//        }

    public void multiply(Matrix B, int row, int col) throws IOException {
        int[][] result = new int[row][col];
            for (int r = 0; r < row; r++) {
                for (int c = 0; c < col; c++) {
                    result[r][c] = (matrix[r][c] * B.matrix[r][c])
                            + (matrix[r][c+1] * B.matrix[r+1][c])
                            + (matrix[r][c+2] * B.matrix[r+2][c]);
                }
            }
        for (int i=0; i < result.length; i++)
            for (int j=0; j < result[0].length; j++)
                    System.out.println(result[i][j]);
    }
}
