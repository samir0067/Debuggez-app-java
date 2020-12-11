package com.hemebiotech;

import com.hemebiotech.fileAccessObject.GetWriteSymptomsOccurrence;
import com.hemebiotech.controller.SymptomReader;
import com.hemebiotech.controller.SymptomReaderImpl;

public class AnalyticsCounter {
    public static void main(String[] args) {

        SymptomReader symptomReader = new SymptomReaderImpl();
        GetWriteSymptomsOccurrence.getAndWriteSymptomsOccurrence(symptomReader);
    }
}
