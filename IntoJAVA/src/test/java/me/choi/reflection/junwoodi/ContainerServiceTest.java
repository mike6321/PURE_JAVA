package me.choi.reflection.junwoodi;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:00 오후
 */
public class ContainerServiceTest {

    @Test
    @DisplayName("@junwoo를 쓰지 않은 BookRepository 테스트")
    public void getObject_BookRepository() {
        BookRepository bookRepository = ContainerService.getObject(BookRepository.class);
        assertThat(bookRepository).isNotNull();
    }

    @Test
    @DisplayName("@junwoo를 쓴 BookService 테스트")
    public void getObject_BookService() {
        BookService bookService = ContainerService.getObject(BookService.class);
        assertThat(bookService).isNotNull();
        assertThat(bookService.bookRepository).isNotNull();
    }
}