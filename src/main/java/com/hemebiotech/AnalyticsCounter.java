package com.hemebiotech;

import com.hemebiotech.business.*;

/**
 * @author Samir
 */
public class AnalyticsCounter {
    public static void main(String[] args) {

        SymptomReader symptomReader = new SymptomFileReader();
        SymptomWriter symptomWriter = new SymptomFileWriter();
        SymptomsBusiness symptomsBusiness = new SymptomsBusiness(symptomReader, symptomWriter);
        symptomsBusiness.getOccurrences();
        symptomsBusiness.writeOccurrences("results.out");
    }
}
