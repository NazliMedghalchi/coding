import java.io.IOException;

/**
 * Created by nazlimedghalchi on 15-12-07.
 */
public class MainMultiply {
    public static void main (String[] args) throws IOException {
        int row = 3;
        int col = 3;
//        Create 2 matix of size 3*3
        Matrix matrixA = new Matrix(row, col);
        Matrix matrixB = new Matrix(row, col);
//        Multiply Matrix
        System.out.println("Results:");
        matrixA.multiply(matrixB, row, col);
    }
}
