package practicecodes;

import java.io.*;
import java.util.*;

public class FileExtract2 {
    public static void main(String[] args) {
        // Input files
        String[] inputFiles = {
            "C:/Users/Suavisindia/Downloads/Import_S01toCode/File_435.xlsx"
        };

        String outputFile = "S01_435.csv";
       // String outputFile = "C:\Users\Suavisindia\OneDrive\Documents\\Filtered_Output.csv";


        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            boolean headerWritten = false;

            for (String file : inputFiles) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String headerLine = br.readLine();
                    if (headerLine == null) continue;

                    String[] header = headerLine.split(",");
                    int orgIndex = -1;
                    for (int i = 0; i < header.length; i++) {
                        if (header[i].trim().equalsIgnoreCase("ORG_NAME")) {
                            orgIndex = i;
                            break;
                        }
                    }

                    if (orgIndex == -1) {
                        System.out.println("ORG_NAME column not found in " + file);
                        continue;
                    }

                    if (!headerWritten) {
                        writer.println(headerLine);
                        headerWritten = true;
                    }

                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] values = line.split(",");
                        if (values.length > orgIndex && values[orgIndex].trim().equals("S01")) {
                            writer.println(line);
                        }
                    }
                }
            }

            System.out.println("Filtered data saved to " + outputFile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

