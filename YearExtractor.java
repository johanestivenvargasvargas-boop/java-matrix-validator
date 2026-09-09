package com.project.identity;

/**
 * Utility class to process identity card numbers and extract embedded information.
 */
public class YearExtractor {

    /**
     * Extracts the 2-digit birth year from an 11-digit identity card number.
     * The input format assumes AAMMDDXXXXX where AA represents the year.
     *
     * @param idNumber Positive 11-digit integer representing the identity card.
     * @return An integer representing the extracted 2-digit year.
     * @throws IllegalArgumentException If the input number does not have 11 digits.
     */
    public static int extractYearFromId(long idNumber) {
        String idString = String.valueOf(idNumber);

        // Validate that the ID number consists of exactly 11 digits
        if (idString.length() != 11 || idNumber <= 0) {
            throw new IllegalArgumentException("The ID number must be a positive 11-digit integer.");
        }

        // Extract the first 2 characters representing the year
        String yearSubstring = idString.substring(0, 2);

        // Convert the extracted substring to an integer
        return Integer.parseInt(yearSubstring);
    }
}
