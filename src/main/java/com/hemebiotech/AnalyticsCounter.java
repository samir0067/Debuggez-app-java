package com.hemebiotech;

import com.hemebiotech.business.*;

import java.io.IOException;

/**
 * @author Samir
 */
public class AnalyticsCounter {
    public static void main(String[] args) throws IOException {

        SymptomReader symptomReader = new SymptomFileReader();
        SymptomWriter symptomWriter = new SymptomFileWriter();
        SymptomsBusiness symptomsBusiness = new SymptomsBusiness(symptomReader, symptomWriter);
        symptomsBusiness.getOccurences();
        symptomsBusiness.writeOccurences("result.out");
    }
}
