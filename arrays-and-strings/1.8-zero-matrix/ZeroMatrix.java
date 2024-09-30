import java.util.HashSet;
import java.util.Set;

/**
 * ZeroMatrix
 */
public class ZeroMatrix {

    public static void zeroMatrix(int m[][]) {
        if (m.length == 0)
            return;

        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                if (m[i][j] == 0 && !rows.contains(i) && !cols.contains(j)) {
                    setZeros(m, i, j);
                    rows.add(i);
                    cols.add(j);
                }
    }

    public static void setZeros(int m[][], int row, int col) {
        for (int i = 0; i < m.length; i++)
            m[i][col] = 0;

        for (int j = 0; j < m[0].length; j++)
            m[row][j] = 0;
    }

    public static void printMatrix(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int m[][] = { { 1, 1, 1, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
        printMatrix(m);
        System.out.println();
        zeroMatrix(m);
        printMatrix(m);
    }
}