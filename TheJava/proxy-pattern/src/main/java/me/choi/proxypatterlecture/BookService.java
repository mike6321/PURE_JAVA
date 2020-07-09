package me.choi.proxypatterlecture;

/**
 * Project : proxy-pattern
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:25 오후
 */
public interface BookService {

    void rent(Book book);

    void returnRent(Book book);

}
