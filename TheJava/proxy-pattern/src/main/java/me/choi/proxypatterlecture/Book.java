package me.choi.proxypatterlecture;

/**
 * Project : proxy-pattern
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:25 오후
 */
public class Book {

    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
