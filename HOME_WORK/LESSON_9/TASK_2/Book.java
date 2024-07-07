package JAVA_OOP_IT3100.HOME_WORK.LESSON_9.TASK_2;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Chapter> chapters;

    public Book(String title) {
        this.title = title;
        this.chapters = new ArrayList<>();
    }

    public void addChapter(Chapter chapter) {
        chapters.add(chapter);
    }

    public int getChapterCount() {
        return chapters.size();
    }

    public int getPageCount() {
        int pageCount = 0;
        for (Chapter chapter : chapters) {
            pageCount += chapter.getPageCount();
        }
        return pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }
}
