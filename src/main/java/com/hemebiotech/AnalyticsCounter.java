package com.hemebiotech;

import com.hemebiotech.fileAccessObject.GetWriteSymptomsOccurrence;
import com.hemebiotech.controller.SymptomReader;
import com.hemebiotech.controller.SymptomReaderImpl;

import java.io.IOException;

public class AnalyticsCounter {
    public static void main(String[] args) throws IOException {

        SymptomReader symptomReader = new SymptomReaderImpl();
        GetWriteSymptomsOccurrence.getAndWriteSymptomsOccurrence(symptomReader);
    }
}
