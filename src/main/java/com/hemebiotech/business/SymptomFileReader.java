package com.hemebiotech.business;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class SymptomFileReader implements SymptomReader {

    /**
     * getting Symptoms
     * @param filepath
     * @return result symptoms list
     */
    @Override
    public List<String> getSymptoms(String filepath) {
        List<String> result = new ArrayList<>();
        try {
            Path path = Paths.get(getClass().getClassLoader().getResource(filepath).toURI());
            return Files.lines(path).collect(Collectors.toList());
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return result;
    }
}
