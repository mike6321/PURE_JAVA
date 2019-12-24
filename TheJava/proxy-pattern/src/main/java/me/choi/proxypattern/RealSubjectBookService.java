package me.choi.proxypattern;

public class RealSubjectBookService implements BookService{

    @Override
    public void rent(Book book) {
        System.out.println("rent :: "+ book.getTitle());
    }
}
