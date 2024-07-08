package JAVA_OOP_IT3100.HOME_WORK.LESSON_10.TASK_1;

public class AverageCalculator {
    private int count;
    private double sum;

    public AverageCalculator() {
        this.count = 0;
        this.sum = 0;
    }

    public double getAverage(String x) throws NumberFormatException {
        if (x == null || x.isEmpty()) {
            throw new NumberFormatException("Inputs can not be empty");
        }

        try {
            int value = Integer.parseInt(x);
            count++;
            sum += value;
            return sum / count;
        } catch (NumberFormatException e) {
            throw new NullPointerException("Input is not a integer");
        }
    }

}
