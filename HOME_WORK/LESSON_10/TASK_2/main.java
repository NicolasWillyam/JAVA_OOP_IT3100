package JAVA_OOP_IT3100.HOME_WORK.LESSON_10.TASK_2;

import java.util.List;

public class main {
    public static void main(String[] args) {
        IntegerReader reader = new IntegerReader();
        String fileName = "/Users/user/Desktop/OOP_JAVA/JAVA_OOP_IT3100/HOME_WORK/LESSON_10/TASK_2/input.txt";
        reader.readListIntegers(fileName);

        // Print out the numbers read from the file
        List<Integer> numbers = reader.getNumbers();
        System.out.println("Numbers read from file:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
