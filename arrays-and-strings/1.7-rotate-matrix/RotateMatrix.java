/**
 * RotateMatrix
 */
public class RotateMatrix {

    public static void rotate90(int m[][]) {
        transpose(m);
        reverseRows(m);
    }

    public static void transpose(int m[][]) {
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < i; j++) {
                int aux = m[j][i];
                m[j][i] = m[i][j];
                m[i][j] = aux;
            }
    }

    public static void reverseRows(int m[][]) {
        for (int i = 0; i * 2 < m.length; i++) {
            int aux[] = m[i];
            m[i] = m[m.length - 1 - i];
            m[m.length - 1 - i] = aux;
        }
    }

    public static void printMatrix(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int m[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        printMatrix(m);
        System.out.println();
        rotate90(m);
        printMatrix(m);
    }
}