package me.choi.doubledispatch.remind.step03;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:57 오전
 */
public class Sales {
    // TODO: 부모타입으로 했을땐 오류안남 2021/04/03 3:03 오전
//    public static void sales(BookStore bookStore) {
//        System.out.println("bookStore = " + bookStore);
//    };
    
    
    // TODO: 구체타입으로 했을땐 오류발생 2021/04/03 3:03 오전
    public static void sales(Kyobo kyobo) {
        System.out.println("kyobo = " + kyobo);
    }

    public static void sales(Bandi bandi) {
        System.out.println("bandi = " + bandi);
    }
}
