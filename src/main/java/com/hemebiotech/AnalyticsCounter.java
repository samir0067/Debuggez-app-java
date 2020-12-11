package com.hemebiotech;

import com.hemebiotech.fileAccessObject.GetWriteSymptomsOccurrence;
import com.hemebiotech.model.SymptomReader;
import com.hemebiotech.model.SymptomReaderImpl;

public class AnalyticsCounter {
    public static void main(String[] args) {

        SymptomReader symptomReader = new SymptomReaderImpl();
        GetWriteSymptomsOccurrence.getAndWriteSymptomsOccurrence(symptomReader);
    }
}
