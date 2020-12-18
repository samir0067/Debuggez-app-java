package com.hemebiotech;

import com.hemebiotech.business.*;

import java.util.List;

/**
 * @author Samir
 */
public class AnalyticsCounter {
    /**
     * @param args
     */
    public static void main(String[] args) {

        SymptomsBusiness symptomsBusiness = new SymptomsBusiness();
        List<String> symptoms = symptomsBusiness.getOccurrences();
        symptomsBusiness.writeOccurrences(symptoms, "results.out");
    }
}
