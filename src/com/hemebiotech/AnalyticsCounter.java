package com.hemebiotech;

import java.io.FileWriter;
import java.util.List;

public class AnalyticsCounter {
	private static final int headacheCount = 0;
	private static int rashCount = 0;
	private static int pupilCount = 0;
	
	public static void main(String args[]) throws Exception {
		ISymptomReader symptomReader = new SymptomReaderImpl();

		List<String> symptomsList = symptomReader.getSymptoms("symptoms.txt");
		StringBuffer buffer = new StringBuffer();
		symptomsList.forEach(buffer::append);

		System.out.println(buffer.toString());

		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dilated pupils: " + pupilCount + "\n");
		writer.close();
//		int i = 0;
//		int headCount = 0;
//		while (line != null) {
//			i++;
//			System.out.println("symptom from file: " + line);
//			if (line.equals("headache")) {
//				headCount++;
//				System.out.println("number of headaches: " + headCount);
//			}
//			else if (line.equals("rush")) {
//				rashCount++;
//			}
//			else if (line.contains("pupils")) {
//				pupilCount++;
//			}
//			line = reader.readLine();
//		}
	}
}
