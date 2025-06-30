package ArrayList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountRecords {

	public static void main(String[] args) {
        File folder = new File("C:\\Users\\Suavisindia\\Downloads\\Accounts Data Load"); // change this to your folder path
        File[] files = folder.listFiles();

        if (files == null) {
            System.out.println("Folder not found or empty.");
            return;
        }

        for (File file : files) {
            if (file.isFile()) {
                String fileName = file.getName().toLowerCase();
                if (fileName.endsWith(".csv") || fileName.endsWith(".xls") || fileName.endsWith(".xlsx")) {
                    int rowCount = countFirstColumnNonEmptyRows(file);
                    System.out.println(file.getName() + " -> Non-empty First Column Rows: " + rowCount);
                } else {
                    System.out.println(file.getName() + " -> Skipped (not a CSV file)");
                }
            }
        }
    }

    private static int countFirstColumnNonEmptyRows(File file) {
        int rowCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(",", -1); // -1 to include trailing empty columns
                if (columns.length > 0 && !columns[0].trim().isEmpty()) {
                    rowCount++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + file.getName());
        }
        return rowCount;
    }
}