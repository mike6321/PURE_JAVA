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
        void postOn(Sns sns);
    }

    static class Text implements Post {
        @Override
        public void postOn(Sns sns) {

            if (sns instanceof Facebook) {
                System.out.println("Text - Facebook");
            }
            if (sns instanceof Twitter) {
                System.out.println("Text - Twitter");
            }
            else {
                throw new IllegalArgumentException();
            }

//            System.out.println("Text -> " + sns.getClass().getSimpleName());
        }
    }

    static class Picture implements Post {
        @Override
        public void postOn(Sns sns) {

            if (sns instanceof Facebook) {
                System.out.println("Picture - Facebook");
            }
            if (sns instanceof Twitter) {
                System.out.println("Picture - Twitter");
            }
            else {
                throw new IllegalArgumentException();
            }

//            System.out.println("Picture -> " + sns.getClass().getSimpleName());
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

//        for (Post post : posts) {
//            for (Sns sns : snsList) {
//                post.postOn(sns);
//            }
//        }

//        posts.stream()
//             .forEach(f -> snsList.forEach(f::postOn));

//        posts.forEach(p -> snsList.forEach(s -> p.postOn(s)));

        posts.forEach(p -> snsList.forEach(p::postOn));

    }

}
