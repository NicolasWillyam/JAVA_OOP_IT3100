package JAVA_OOP_IT3100.HOME_WORK.LESSON_5;

public class StringConcatenationTest {

    public static void main(String[] args) {
        int n = 100000;
        String result = "";

        // Đo thời gian bắt đầu
        long startTime = System.nanoTime();

        for (int i = 0; i < n; i++) {
            result += "abc";
        }

        // Đo thời gian kết thúc
        long endTime = System.nanoTime();

        // Tính thời gian thực hiện
        long duration = endTime - startTime;

        System.out.println("Thời gian sử dụng String: " + duration + " nanoseconds");
    }
}
