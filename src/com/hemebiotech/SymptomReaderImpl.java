package com.hemebiotech;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;


public class SymptomReaderImpl implements ISymptomReader {

    @Override
    public List<String> getSymptoms(String filepath) {
        try {
            Path path = Paths.get(filepath);
            return Files.lines(path).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
