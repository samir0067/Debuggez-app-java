package com.hemebiotech.fileAccessObject;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetSymptomList {
    /**
     * get a list of symptoms
     *
     * @param occurrenceMap
     * @return
     */
    protected static List<String> getOccurrenceSymptomList(Map<String, Integer> occurrenceMap) {
        List<String> occurrenceSymptomList = occurrenceMap
                .entrySet()
                .stream()
                .map(entry -> entry.getKey() + " = " + entry.getValue())
                .collect(Collectors.toList());
        occurrenceSymptomList.forEach(entry -> System.out.println(entry));
        return occurrenceSymptomList;
    }
}
