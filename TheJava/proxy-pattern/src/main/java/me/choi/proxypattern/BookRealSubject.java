package me.choi.proxypattern;

/**
 * Project : proxy-pattern
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:04 오후
 */
public class BookRealSubject implements BookService{

    @Override
    public void rent(Book book) {
        System.out.println("Rent : "+ book.getTitle());
    }

    @Override
    public void returnRent(Book book) {
        System.out.println("returnRent : "+ book.getTitle());
    }
}
