package com.hemebiotech.helper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Convert the symptoms into a map of occurrences and you get the list
 * @author Samir
 */
public class SymptomsUtils {

    /**
     * @param symptomsList
     * @return
     */
    public static Map<String, Integer> convertToOccurrenceMap(List<String> symptomsList) {
        Map<String, Integer> occurrenceMap = new HashMap<>();
        symptomsList.forEach(symptom -> {
            if (occurrenceMap.containsKey(symptom)) {
                occurrenceMap.put(symptom, occurrenceMap.get(symptom) + 1);
            } else {
                occurrenceMap.put(symptom, 1);
            }
        });
        return occurrenceMap;
    }

    /**
     * @param occurrenceMap
     * @return
     */
    public static List<String> occurenceMapSortingToList(Map<String, Integer> occurrenceMap) {
        List<String> occurrenceSymptomList = occurrenceMap
                .entrySet()
                .stream()
                .map(entry -> entry.getKey() + " = " + entry.getValue())
                .sorted()
                .collect(Collectors.toList());
        return occurrenceSymptomList;
    }
}
