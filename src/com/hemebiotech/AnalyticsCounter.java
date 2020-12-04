package com.hemebiotech;

import com.hemebiotech.controller.getWriteSymptomsOccurrence;
import com.hemebiotech.model.ISymptomReader;
import com.hemebiotech.model.ReadSymptomDataFromFile;
import com.hemebiotech.model.SymptomReaderImpl;

public class AnalyticsCounter {

    public static void main(String[] args) throws Exception {

        ISymptomReader symptomReader = new ReadSymptomDataFromFile();

        getWriteSymptomsOccurrence.getAndWriteSymptomsOccurrence(symptomReader);
    }
}
