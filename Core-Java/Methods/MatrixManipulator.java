import java.util.Random;

public class MatrixManipulator {

    public static void main(String[] args) {
        double[][] matrix2x2 = createRandomMatrix(2, 2);
        double[][] matrix3x3 = createRandomMatrix(3, 3);

        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix2x2));

        System.out.println("\nDeterminant of 2x2 Matrix: " + determinant2x2(matrix2x2));

        System.out.println("\nInverse of 2x2 Matrix:");
        double[][] inverse2x2 = inverse2x2(matrix2x2);
        displayMatrix(inverse2x2);

        System.out.println("\n-----------------------------");

        System.out.println("3x3 Matrix:");
        displayMatrix(matrix3x3);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix3x3));

        System.out.println("\nDeterminant of 3x3 Matrix: " + determinant3x3(matrix3x3));

        System.out.println("\nInverse of 3x3 Matrix:");
        double[][] inverse3x3 = inverse3x3(matrix3x3);
        displayMatrix(inverse3x3);
    }

    // Create a Random Matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10) + 1;  // Random number between 1 and 10
            }
        }
        return matrix;
    }

    // Transpose
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] trans = new double[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                trans[i][j] = matrix[j][i];
            }
        }
        return trans;
    }

    // Determinant of 2x2 Matrix
    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Determinant of 3x3 Matrix
    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1]) -
               m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0]) +
               m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // Inverse of 2x2 Matrix
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) {
            System.out.println("Matrix is singular and cannot be inverted.");
            return new double[2][2];
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = m[1][1] / det;
        inverse[0][1] = -m[0][1] / det;
        inverse[1][0] = -m[1][0] / det;
        inverse[1][1] = m[0][0] / det;
        return inverse;
    }

    // Inverse of 3x3 Matrix
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) {
            System.out.println("Matrix is singular and cannot be inverted.");
            return new double[3][3];
        }

        double[][] inv = new double[3][3];

        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = (m[0][2]*m[2][1] - m[0][1]*m[2][2]) / det;
        inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = (m[1][2]*m[2][0] - m[1][0]*m[2][2]) / det;
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = (m[0][2]*m[1][0] - m[0][0]*m[1][2]) / det;

        inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = (m[0][1]*m[2][0] - m[0][0]*m[2][1]) / det;
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

    // Display Matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%10.4f ", val);
            }
            System.out.println();
        }
    }
}
