package com.hemebiotech.business;

import com.hemebiotech.helper.SymptomsUtils;

import java.util.List;
import java.util.Map;

/**
 * obtain from a file and write Symptoms Occurrence
 */
public class SymptomsBusiness {

    private final SymptomReader symptomReader;
    private final SymptomWriter symptomWriter;
    private List<String> symptomsList;
    private List<String> occurrenceSymptomList;

    public SymptomsBusiness(SymptomReader symptomReader, SymptomWriter symptomWriter) {

        this.symptomReader = symptomReader;
        this.symptomWriter = symptomWriter;
    }

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
