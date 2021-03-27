package me.choi.optional.example03;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 12:44 오후
 */
public class OptionalTest {

    @Test
    public void optionalTest() {
        List<OnlineClass> springClass = new ArrayList<>();
        springClass.add(new OnlineClass(1, "spring boot", true));
        springClass.add(new OnlineClass(2, "spring data jpa", true));
        springClass.add(new OnlineClass(3, "spring mvc", false));
        springClass.add(new OnlineClass(4, "spring core", false));
        springClass.add(new OnlineClass(5, "rest api", false));

        // TODO: Optional 개요 2021/03/05 12:50 오후
        /**
         * 1. Null을 리턴하는 것 자체가 문제
         * 2. if 로 예외를 처리하면 사람이기떄문에 분명 실수를 한다.
         * */
        OnlineClass spring_boot = new OnlineClass(1, "spring boot", true);
//        assertThat(spring_boot.getProgress()).isNull();
        assertThat(spring_boot.getProgress()).isNotNull();

//        spring_boot.setProgress(null);



    }
}