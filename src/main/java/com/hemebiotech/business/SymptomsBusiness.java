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

    /**
     * Constructors
     */
    public SymptomsBusiness() {
        this.symptomReader = new SymptomFileReader();
        this.symptomWriter = new SymptomFileWriter();
    }

    /**
     * Obtain from a file and write symptoms occurrence
     */
    public List<String> getOccurrences() {
        List<String> symptomsList = symptomReader.getSymptoms("symptoms.txt");

        Map<String, Integer> occurrenceMap = SymptomsUtils.convertToOccurrenceMap(symptomsList);

        return SymptomsUtils.occurenceMapSortingToList(occurrenceMap);
    }

    /**
     * Allows you to write the Occurrences in a file
     * @param symptoms
     * @param fileName
     */
    public void writeOccurrences(List<String> symptoms, String fileName) {
        symptomWriter.writeOccurrences(symptoms, fileName);
    }
}
