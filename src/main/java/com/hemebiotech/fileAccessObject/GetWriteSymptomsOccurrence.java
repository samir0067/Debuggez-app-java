package com.hemebiotech.fileAccessObject;

import com.hemebiotech.controller.SymptomReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * obtain from a file and write Symptoms Occurrence
 */
public class GetWriteSymptomsOccurrence {
    /**
     * obtain and write down the onset of symptoms
     *
     * @param symptomReader
     * @throws IOException
     */
    public static void getAndWriteSymptomsOccurrence(SymptomReader symptomReader) throws IOException {
        List<String> symptomsList = symptomReader.getSymptoms("symptoms.txt");

        Map<String, Integer> occurrenceMap = ConvertMapOccurrences.convertToOccurrenceMap(symptomsList);
        List<String> occurrenceSymptomList = GetSymptomList.getOccurrenceSymptomList(occurrenceMap);
        WriteOccurrenceFile.WriteOccurrence(occurrenceSymptomList);
    }
}
