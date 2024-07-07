package JAVA_OOP_IT3100.HOME_WORK.LESSON_5;

public class StringBufferAppendTest {

    public static void main(String[] args) {
        int n = 100000;
        StringBuffer sb = new StringBuffer();

        // Đo thời gian bắt đầu
        long startTime = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sb.append("abc");
        }

        // Đo thời gian kết thúc
        long endTime = System.nanoTime();

        // Tính thời gian thực hiện
        long duration = endTime - startTime;

        System.out.println("Thời gian sử dụng StringBuffer: " + duration + " nanoseconds");
    }
}
