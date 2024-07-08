package JAVA_OOP_IT3100.HOME_WORK.LESSON_10.TASK_1;

public class Test {
    public static void main(String[] args) {
        AverageCalculator calculator = new AverageCalculator();

        // Example usage:
        String input1 = "10";
        String input2 = "15";
        String input3 = "abc"; // Xâu không phải là số
        String input4 = ""; // Xâu rỗng

        try {
            System.out.println("Average: " + calculator.getAverage(input1)); // 10.0 / 1 = 10.0
            System.out.println("Average: " + calculator.getAverage(input2)); // (10.0 + 15.0) / 2 = 12.5
            System.out.println("Average: " + calculator.getAverage(input3)); // Ngoại lệ NumberFormatException
            System.out.println("Average: " + calculator.getAverage(input4)); // Ngoại lệ NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
