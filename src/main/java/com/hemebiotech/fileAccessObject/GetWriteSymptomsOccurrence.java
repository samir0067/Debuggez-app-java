package com.hemebiotech.fileAccessObject;

import com.hemebiotech.controller.SymptomReader;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
    public static void getAndWriteSymptomsOccurrence(SymptomReader symptomReader) {
        List<String> symptomsList = symptomReader.getSymptoms("symptoms.txt");

        Map<String, Integer> occurrenceMap = ConvertMapOccurrences.convertToOccurrenceMap(symptomsList);

        List<String> occurrenceSymptomList = getOccurrenceSymptomList(occurrenceMap);

        WriteOccurrenceFile(occurrenceSymptomList);
    }

    /**
     * get a list of symptoms
     *
     * @param occurrenceMap
     * @return
     */
    private static List<String> getOccurrenceSymptomList(Map<String, Integer> occurrenceMap) {
        List<String> occurrenceSymptomList = occurrenceMap
                .entrySet()
                .stream()
                .map(entry -> entry.getKey() + " = " + entry.getValue())
                .collect(Collectors.toList());
//        occurrenceSymptomList.forEach(entry -> System.out.println(entry));
        return occurrenceSymptomList;
    }

    /**
     * Writing an occurrence file
     *
     * @param occurrenceSymptomList
     * @throws IOException
     */
    private static void WriteOccurrenceFile(List<String> occurrenceSymptomList) {
        try {
            FileWriter writer = new FileWriter("result.out");
            for (String entry : occurrenceSymptomList) {
                writer.write(entry + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
