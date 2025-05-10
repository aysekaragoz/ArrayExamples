public class MatrixApp {
    public static int[][] matrixeven(int[][] matrix1, int[][] matrix2) {
        int[][]matrixeven = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrixeven[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrixeven;
    }
    public static double[][] matrixeven(double[][] matrix1, double[][] matrix2) {
        double[][]matrixeven = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrixeven[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrixeven;
    }
    public static int[][]matrixodd(int[][] matrix1, int[][] matrix2) {
        int[][]matrixodd = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrixodd[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrixodd;
    }
    public static double[][]matrixodd(double[][] matrix1, double[][] matrix2) {
        double[][]matrixodd = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrixodd[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrixodd;
    }
    public static int[][] matrixmultiply(int[][] matrix1, int[][] matrix2) {
        int[][] matrixmultiply = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrixmultiply[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return matrixmultiply;
    }
    public static double[][] matrixmultiply(double[][] matrix1, double[][] matrix2) {
        double [][] matrixmultiply = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrixmultiply[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return matrixmultiply;
    }


}
