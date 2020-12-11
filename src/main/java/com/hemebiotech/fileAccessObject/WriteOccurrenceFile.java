package com.hemebiotech.fileAccessObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteOccurrenceFile {
    /**
     * Writing an occurrence file
     *
     * @param occurrenceSymptomList
     * @throws IOException
     */
    protected static void WriteOccurrence(List<String> occurrenceSymptomList) throws IOException {
        FileWriter writer = new FileWriter("result.out");
        try {
            for (String entry : occurrenceSymptomList) {
                writer.write(entry + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
