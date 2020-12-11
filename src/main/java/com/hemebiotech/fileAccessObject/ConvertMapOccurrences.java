package com.hemebiotech.fileAccessObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertMapOccurrences {
    /**
     * convert to Map of occurrences
     * @param symptomsList
     * @return
     */
    protected static Map<String, Integer> convertToOccurrenceMap(List<String> symptomsList) {
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
}
