package me.choi.proxypattern;

public class BookServiceProxy implements BookService{

    BookService bookService;

    //interface를 파라미터로 주입
    public BookServiceProxy(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void rent(Book book) {

//        System.out.println("111111");
//        System.out.println(book.getTitle());
//        System.out.println("2222222");
        System.out.println("hibernate Spirng");
    }
}
