package com.hemebiotech.business;

import com.hemebiotech.helper.SymptomsUtils;

import java.util.List;
import java.util.Map;

/**
 * read the data from a text file and count all occurrences of any symptom listed in the file generate a new file that lists each symptom
 * in alphabetical order, followed by the number of hits in the file
 */
public class SymptomsBusiness {

    private final SymptomReader symptomReader;
    private final SymptomWriter symptomWriter;
    private List<String> symptomsList;
    private List<String> occurrenceSymptomList;

    /**
     * Constructors
     * @param symptomReader
     * @param symptomWriter
     */
    public SymptomsBusiness(SymptomReader symptomReader, SymptomWriter symptomWriter) {

        this.symptomReader = symptomReader;
        this.symptomWriter = symptomWriter;
    }

    /**
     * Obtain from a file and write symptoms occurrence
     */
    public void getOccurrences() {
        this.symptomsList = this.symptomReader.getSymptoms("symptoms.txt");

        Map<String, Integer> occurrenceMap = SymptomsUtils.convertToOccurrenceMap(symptomsList);

        this.occurrenceSymptomList = SymptomsUtils.occurenceMapSortingToList(occurrenceMap);
    }

    /**
     * @param fileName
     */
    public void writeOccurrences(String fileName) {
        this.symptomWriter.writeOccurrences(this.occurrenceSymptomList, fileName);
    }
}
