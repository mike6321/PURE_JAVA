package me.choi.generic.generic2;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:14 오후
 */
public class Banana implements Entity<Integer>{

    private Integer id;

    public static Banana of(Integer id) {
        Banana banana = new Banana();
        banana.id = id;
        return banana;
    }

    @Override
    public Integer getId() {
        return id;
    }
}
