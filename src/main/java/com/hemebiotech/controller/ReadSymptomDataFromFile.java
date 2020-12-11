package com.hemebiotech.controller;

import com.hemebiotech.business.SymptomReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 */
public class ReadSymptomDataFromFile implements SymptomReader {

    /**
     * @param filepath
     * @return
     */
    @Override
    public List<String> getSymptoms(String filepath) {
        var result = new ArrayList<String>();

        if (filepath != null) {
            try {
                var reader = new BufferedReader(new FileReader(filepath));
                var line = reader.readLine();

                while (line != null) {
                    result.add(line);
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
