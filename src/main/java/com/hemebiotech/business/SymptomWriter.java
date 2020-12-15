package com.hemebiotech.business;

import java.util.List;

public interface SymptomWriter {

    /**
     * Written a list of all symptoms from a data source into a file
     * @param occurrenceSymptomList
     * @param fileName
     */
    void writeOccurrences(List<String> occurrenceSymptomList, String fileName);
}
