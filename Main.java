package com.project.matrix;

import java.util.Arrays;

/**
 * Example program to demonstrate MatrixValidator functionality.
 */
public class Main {

    public static void main(String[] args) {
        // Sample 2x2 transition matrix
        double[][] sampleMatrix = {
            {0.7, 0.3},
            {0.2, 0.8}
        };

        // 1. Validate if matrix is square
        boolean isSquare = MatrixValidator.isSquareMatrix(sampleMatrix);
        System.out.println("Is the matrix square? " + isSquare);

        // 2. Compute row sums
        if (isSquare) {
            double[] rowSums = MatrixValidator.getRowSums(sampleMatrix);
            System.out.println("Row sums: " + Arrays.toString(rowSums));
        }
    }
}
