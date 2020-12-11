package com.hemebiotech.helper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SymptomsUtils {
    /**
     * convert to Map of occurrences
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

    public static List<String> occurenceMapToList(Map<String, Integer> occurrenceMap) {
        List<String> occurrenceSymptomList = occurrenceMap
                .entrySet()
                .stream()
                .map(entry -> entry.getKey() + " = " + entry.getValue())
                .collect(Collectors.toList());
        occurrenceSymptomList.forEach(entry -> System.out.println(entry));
        return occurrenceSymptomList;
    }
}
