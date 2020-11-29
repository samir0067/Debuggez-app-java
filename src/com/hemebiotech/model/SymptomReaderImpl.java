package com.hemebiotech.model;

import com.hemebiotech.model.ISymptomReader;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;


public class SymptomReaderImpl implements ISymptomReader {

    @Override
    public List<String> getSymptoms(String filepath) {
        try {
            Path path = Paths.get(getClass().getClassLoader().getResource(filepath).toURI());
            return Files.lines(path).collect(Collectors.toList());
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }
}
