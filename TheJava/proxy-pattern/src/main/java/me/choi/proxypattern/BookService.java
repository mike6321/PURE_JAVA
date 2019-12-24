package me.choi.proxypattern;

public  class BookService {

    public BookService() {

    }
    public void rent(Book book) {
        System.out.println("rent : "+book.getTitle());
    }
    public void returnBook(Book book) {
        System.out.println("returnBook : "+book.getTitle());
    }

}
