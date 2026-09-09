package com.project.identity;

import java.util.Scanner;

/**
 * Demonstration program for extracting the year from an identity card number.
 */
public class Main {

    public static void main(String[] args) {
        // Sample input from the specification: 11-digit ID number
        long sampleId = 86021912345L;

        System.out.println("=== Identity Card Year Extractor ===");
        System.out.println("Input ID number: " + sampleId);

        try {
            // Process and extract the year
            int extractedYear = YearExtractor.extractYearFromId(sampleId);
            System.out.println("Extracted Year: " + extractedYear);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
