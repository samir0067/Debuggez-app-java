package com.hemebiotech;

import com.hemebiotech.controller.GetWriteSymptomsOccurrence;
import com.hemebiotech.model.ISymptomReader;
import com.hemebiotech.model.SymptomReaderImpl;

public class AnalyticsCounter {
    public static void main(String[] args) {

        ISymptomReader symptomReader = new SymptomReaderImpl();
        GetWriteSymptomsOccurrence.getAndWriteSymptomsOccurrence(symptomReader);
    }
}
