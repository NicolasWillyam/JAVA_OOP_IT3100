package JAVA_OOP_IT3100.HOME_WORK.LESSON_9.TASK_2;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String title;
    private List<Page> pages;

    public Chapter(String title) {
        this.title = title;
        this.pages = new ArrayList<>();
    }

    public void addPage(Page page) {
        pages.add(page);
    }

    public int getPageCount() {
        return pages.size();
    }

    public String getTitle() {
        return title;
    }

    public void setTitlte(String title) {
        this.title = title;
    }

    public List<Page> getPages() {
        return pages;
    }
}
