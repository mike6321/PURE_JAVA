package me.choi.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:45 오후
 */
@Service
public interface BookService {
    void rent(Book book);
}
