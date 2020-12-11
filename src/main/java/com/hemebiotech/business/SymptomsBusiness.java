package com.hemebiotech.business;

import com.hemebiotech.helper.SymptomsUtils;

import java.io.IOException;
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

    /**
     * obtain and write down the onset of symptoms
     *
     * @param symptomReader
     * @throws IOException
     */
    public void getOccurences() throws IOException {
        this.symptomsList = this.symptomReader.getSymptoms("symptoms.txt");

        Map<String, Integer> occurrenceMap = SymptomsUtils.convertToOccurrenceMap(symptomsList);

        this.occurrenceSymptomList = SymptomsUtils.occurenceMapToList(occurrenceMap);

    }

    public void writeOccurences(String fileName) {
        this.symptomWriter.writeOccurences(this.occurrenceSymptomList, fileName);
    }
}
