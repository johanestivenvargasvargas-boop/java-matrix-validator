package com.project.matrix;

/**
 * Utility class to perform basic operations on square matrices.
 */
public class MatrixValidator {

    /**
     * Checks if a matrix is square (same number of rows and columns).
     * 
     * @param matrix 2D array to check
     * @return true if square, false otherwise
     */
    public static boolean isSquareMatrix(double[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int rows = matrix.length;
        for (int i = 0; i < rows; i++) {
            if (matrix[i] == null || matrix[i].length != rows) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calculates the sum of elements in each row of a matrix.
     * 
     * @param matrix 2D array
     * @return Array containing the sum of each row
     */
    public static double[] getRowSums(double[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null.");
        }

        double[] sums = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            double currentSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                currentSum += matrix[i][j];
            }
            sums[i] = currentSum;
        }
        return sums;
    }
}
