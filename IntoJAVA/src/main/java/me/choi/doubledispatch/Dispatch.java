package me.choi.doubledispatch;

import java.util.Arrays;
import java.util.List;

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
            sns.post(this);
        }
    }

    static class Picture implements Post {

        @Override
        public void postOn(Sns sns) {
            sns.post(this);
        }
    }

    interface Sns {
        void post(Text post);
        void post(Picture post);
    }

    static class Facebook implements Sns {

        @Override
        public void post(Text post) {
            System.out.println("Text - Facebook");
        }

        @Override
        public void post(Picture post) {
            System.out.println("Picture - Facebook");
        }
    }

    static class Twitter implements Sns {

        @Override
        public void post(Text post) {
            System.out.println("Text - Twitter");
        }

        @Override
        public void post(Picture post) {
            System.out.println("Picture - Twitter");
        }
    }

    static class Instagram implements Sns {

        @Override
        public void post(Text post) {
            System.out.println("Text - Instagram");
        }

        @Override
        public void post(Picture post) {
            System.out.println("Picture - Instagram");
        }
    }


    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(new Text(), new Picture());
        List<Sns> snsList = Arrays.asList(new Facebook(), new Twitter(), new Instagram());


        posts.forEach(p -> snsList.forEach(s -> p.postOn(s)));

    }

}
