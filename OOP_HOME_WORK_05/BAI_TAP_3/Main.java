package OOP_HOME_WORK_05.BAI_TAP_3;

public class Main {
    public static void main(String[] args) {
        // Sử dụng String
        long startTimeString = System.nanoTime();
        String resultString = "";
        for (int i = 0; i < 10000; i++) {
            resultString += "a";
        }
        long endTimeString = System.nanoTime();
        long durationString = endTimeString - startTimeString;
        System.out.println("Thời gian thực hiện phép cộng xâu với String: " + durationString + " nanoseconds");

        // Sử dụng StringBuffer
        long startTimeStringBuffer = System.nanoTime();
        StringBuffer resultStringBuffer = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            resultStringBuffer.append("a");
        }
        long endTimeStringBuffer = System.nanoTime();
        long durationStringBuffer = endTimeStringBuffer - startTimeStringBuffer;
        System.out.println(
                "Thời gian thực hiện phép cộng xâu với StringBuffer: " + durationStringBuffer + " nanoseconds");
    }
}