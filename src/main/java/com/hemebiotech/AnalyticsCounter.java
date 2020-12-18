package com.hemebiotech;

import com.hemebiotech.business.*;

import java.util.List;

/**
 * @author Samir
 */
public class AnalyticsCounter {
    public static void main(String[] args) {

        SymptomsBusiness symptomsBusiness = new SymptomsBusiness();
        List<String> symptoms = symptomsBusiness.getOccurrences();
        symptomsBusiness.writeOccurrences("results.out", symptoms);
    }
}
