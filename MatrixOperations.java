import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();
        
        int[][] matrixA = generateRandomMatrix(rows, cols);
        int[][] matrixB = generateRandomMatrix(rows, cols);
        
        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("Matrix B:");
        displayMatrix(matrixB);
        
        System.out.println("Matrix Addition:");
        displayMatrix(addMatrices(matrixA, matrixB));
        
        System.out.println("Matrix Subtraction:");
        displayMatrix(subtractMatrices(matrixA, matrixB));
        
        if (rows == cols) {
            System.out.println("Transpose of Matrix A:");
            displayMatrix(transposeMatrix(matrixA));
            
            if (rows == 2) {
                System.out.println("Determinant of Matrix A: " + determinant2x2(matrixA));
                System.out.println("Inverse of Matrix A:");
                displayMatrix(inverse2x2(matrixA));
            } else if (rows == 3) {
                System.out.println("Determinant of Matrix A: " + determinant3x3(matrixA));
                System.out.println("Inverse of Matrix A:");
                displayMatrix(inverse3x3(matrixA));
            }
        }
    }

    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] matrix) {
        if (matrix == null) {
            System.out.println("Matrix has no inverse.");
            return;
        }
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.3f ", value);
            }
            System.out.println();
        }
    }

    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
               matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
               matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    public static double[][] inverse2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix);
        if (determinant == 0) {
            System.out.println("Matrix has no inverse");
            return null;
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;
        return inverse;
    }

    public static double[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) {
            System.out.println("Matrix has no inverse");
            return null;
        }
        double[][] inverse = new double[3][3];
        return inverse;
    }
}
