package practicecodes;
import java.io.*;
import java.util.*;

public class FileExtract {
    public static void main(String[] args) {
        // Input files
        String[] inputFiles = {
            "C:\\Users\\Suavisindia\\Downloads\\New folder\\Serial number Extract Query v2 03202025.224",
 //           "C:\\Users\\Suavisindia\\Downloads\\New folder\\Serial number Extract Query v2 03202025.235",
 //          "C:\\Users\\Suavisindia\\Downloads\\New folder\\Serial number Extract Query v2 03202025.236",
//            "C:\\Users\\Suavisindia\\Downloads\\New folder\\Serial number Extract Query v2 03202025.274",
//            "C:\\Users\\Suavisindia\\Downloads\\New folder\\Serial number Extract Query v2 03202025.252",
//            "C:\\Users\\Suavisindia\\Downloads\\New folder\\Serial number Extract Query v2 03202025.253",
//            "C:\\Users\\Suavisindia\\Downloads\\New folder\\Serial number Extract Query v2 03202025.254",
//            "C:\\Users\\Suavisindia\\Downloads\\New folder\\Serial number Extract Query v2 03202025.255",
//            "C:\\Users\\Suavisindia\\Downloads\\New folder\\Serial number Extract Query v2 03202025.256",
//            "C:\\Users\\Suavisindia\\Downloads\\New folder\\Serial number Extract Query v2 03202025.257",
//            "C:\\Users\\Suavisindia\\Downloads\\New folder\\Serial number Extract Query v2 03202025.258"
        };

        String outputFile = "Filtered_Output5.csv";
       // String outputFile = "Downloads\\Filtered_Output.csv";


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
                        if (values.length > orgIndex && values[orgIndex].trim().equals("M01")) {
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
