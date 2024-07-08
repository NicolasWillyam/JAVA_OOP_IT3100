package JAVA_OOP_IT3100.HOME_WORK.LESSON_10.TASK_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IntegerReader {

    private List<Integer> numbers = new ArrayList<>();

    public void readListIntegers(String fileName) {
        // Check for empty file name
        if (fileName == null || fileName.trim().isEmpty()) {
            System.err.println("Error: File name is empty");
            return;
        }

        File file = new File(fileName);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 0;

            // Read the first line to get the count of numbers
            if ((line = reader.readLine()) != null) {
                try {
                    int count = Integer.parseInt(line.trim());
                    lineNumber++;
                } catch (NumberFormatException e) {
                    System.err.println("Error: First line is not a valid integer");
                    return;
                }
            } else {
                System.err.println("Error: File is empty");
                return;
            }

            // Read subsequent lines for integers
            while ((line = reader.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line.trim());
                    numbers.add(number);
                    lineNumber++;
                } catch (NumberFormatException e) {
                    System.err.println("Error: Line " + lineNumber + " is not a valid integer");
                }
            }

        } catch (IOException e) {
            System.err.println("Error: Unable to open or read file " + fileName);
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

}
