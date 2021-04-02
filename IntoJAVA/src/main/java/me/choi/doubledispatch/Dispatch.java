package me.choi.doubledispatch;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment : 메서드 디스패치
 * Time : 10:32 오후
 */
public class Dispatch {
    interface Post {
        void postOn(Facebook facebook);
        void postOn(Twitter twitter);
    }

    static class Text implements Post {

        @Override
        public void postOn(Facebook facebook) {
            System.out.println("Text - facebook");
        }

        @Override
        public void postOn(Twitter twitter) {
            System.out.println("Text - twitter");
        }

    }

    static class Picture implements Post {

        @Override
        public void postOn(Facebook facebook) {
            System.out.println("Picture - facebook");
        }

        @Override
        public void postOn(Twitter twitter) {
            System.out.println("Picture - twitter");
        }
    }

    interface Sns {

    }

    static class Facebook implements Sns {

    }

    static class Twitter implements Sns {

    }
    // TODO: Sns 타입 추가 2021/04/03 12:03 오전
    static class Instagram implements Sns{

    }

    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(new Text(), new Picture());
        List<Sns> snsList = Arrays.asList(new Facebook(), new Twitter(), new Instagram());


        posts.forEach(p -> snsList.forEach(s -> p.postOn(s)));

    }

}
