package com.hemebiotech.controller;

import com.hemebiotech.model.ISymptomReader;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * obtenir Écrire Symptômes Occurrence
 */
public class getWriteSymptomsOccurrence {
    /**
     * obtenir et écrire l'apparition des symptômes
     * @param symptomReader
     * @throws IOException
     */
    public static void getAndWriteSymptomsOccurrence(ISymptomReader symptomReader) throws IOException {
        List<String> symptomsList = symptomReader.getSymptoms("symptoms.txt");

        Map<String, Integer> occurrenceMap = convertToOccurrenceMap(symptomsList);

        List<String> occurrenceSymptomList = getOccurrenceSymptomList(occurrenceMap);

        WriteOccurrenceFile(occurrenceSymptomList);
    }

    /**
     * obtenir la liste des symptômes
     * @param occurrenceMap
     * @return
     */
    private static List<String> getOccurrenceSymptomList(Map<String, Integer> occurrenceMap) {
        List<String> occurrenceSymptomList = occurrenceMap
                .entrySet()
                .stream()
                .map(stringIntegerEntry -> stringIntegerEntry.getKey() + " = " + stringIntegerEntry.getValue())
                .collect(Collectors.toList());
        occurrenceSymptomList.forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry));
        return occurrenceSymptomList;
    }

    /**
     * convertir en carte d'occurrences
     * @param symptomsList
     * @return
     */
    private static Map<String, Integer> convertToOccurrenceMap(List<String> symptomsList) {
        Map<String, Integer> occurrenceMap = new HashMap<>();
        symptomsList.forEach(s -> {
            if (occurrenceMap.containsKey(s)) {
                occurrenceMap.put(s, occurrenceMap.get(s) + 1);
            } else {
                occurrenceMap.put(s, 1);
            }
        });
        return occurrenceMap;
    }

    /**
     * Rédiger un fichier d'événement
     * @param occurrenceSymptomList
     * @throws IOException
     */
    private static void WriteOccurrenceFile(List<String> occurrenceSymptomList) throws IOException {
        FileWriter writer = new FileWriter("result.out");
        occurrenceSymptomList.forEach(stringIntegerEntry -> {
            try {
                writer.write(stringIntegerEntry + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.close();
    }
}
