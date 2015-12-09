import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nazlimedghalchi on 15-12-07.
 */
public class Multiply {
    public int [][] A = new int[10][10];
    public int [][] B = new int[10][10];
    public int [][] C = new int[10][10];

    public  Multiply() throws IOException {
        while (A != null && B != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input;
            while ((input = reader.readLine()) != null && input.length() != 0) {
                for (int i=0; i <= C.length; i++) {
                    for (int j=0; j<C.length; j++) {
                        A[i][j] = input.indexOf(i);
                        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
                        String in;
                        while ((in = read.readLine()) != null && in.length() != 0)
                            B[i][j] = input.indexOf(i);
                        for (int k = 0; k <= C.length; k++) {
                            for (int p=0; p<C.length; p++) {
                                C[k][p] += (A[k][p] * B[k][p]);
                                System.out.println("C[][]:" + C);
                            }
                        }

                    }
                }
            }

        }
    }

}
