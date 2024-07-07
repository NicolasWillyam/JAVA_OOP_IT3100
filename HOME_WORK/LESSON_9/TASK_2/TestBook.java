package JAVA_OOP_IT3100.HOME_WORK.LESSON_9.TASK_2;

import java.util.List;

public class TestBook {
    public static void main(String[] args) {
        // Tạo một quyển sách mới
        Book book = new Book("Java Programming");

        // Tạo các trang cho chương 1
        Chapter chapter1 = new Chapter("Introduction to Java");
        chapter1.addPage(new Page("Page 1 content"));
        chapter1.addPage(new Page("Page 2 content"));
        chapter1.addPage(new Page("Page 3 content"));

        // Tạo các trang cho chương 2
        Chapter chapter2 = new Chapter("Object-Oriented Programming");
        chapter2.addPage(new Page("Page 1 content"));
        chapter2.addPage(new Page("Page 2 content"));

        // Thêm các chương vào quyển sách
        book.addChapter(chapter1);
        book.addChapter(chapter2);

        // In ra thông tin về quyển sách
        System.out.println("Book title: " + book.getTitle());
        System.out.println("Number of chapters: " + book.getChapterCount());
        System.out.println("Number of pages: " + book.getPageCount());

        // In ra từng chương và số lượng trang của từng chương
        List<Chapter> chapters = book.getChapters();
        for (Chapter chapter : chapters) {
            System.out.println("Chapter: " + chapter.getTitle());
            System.out.println("Number of pages in chapter: " + chapter.getPageCount());
        }
    }
}
