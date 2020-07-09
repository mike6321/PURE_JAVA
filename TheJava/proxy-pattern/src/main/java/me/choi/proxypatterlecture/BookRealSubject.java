package me.choi.proxypatterlecture;

/**
 * Project : proxy-pattern
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:26 오후
 */
public class BookRealSubject implements BookService{

    @Override
    public void rent(Book book) {
        System.out.println("RENT :: "+book.getTitle());
    }

    @Override
    public void returnRent(Book book) {
        System.out.println("returnRent :: "+book.getTitle());
    }

}
