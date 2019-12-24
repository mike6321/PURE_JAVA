package me.choi.proxypattern;

public class BookService {

//    void rent(Book book);
//
//    void returnBook(Book book);
    public void rent(Book book) {
        System.out.println("rent : "+ book.getTitle());
    }
    public void returnBook(Book book) {
        System.out.println("returnBook : "+ book.getTitle());
    }
}
