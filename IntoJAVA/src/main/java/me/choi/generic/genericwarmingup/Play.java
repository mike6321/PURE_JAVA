package me.choi.generic.genericwarmingup;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:41 오후
 */
//public class Play <T extends Game>{
public class Play <T>{
    public static void main(String[] args) {
        Play<?> lolPlay = new Play<>();
//        Play<Wow> wowPlay = new Play<>();
        
        lolPlay.doSomething(new Play<Lol>());
        lolPlay.doSomething(new Play<Game>());
        lolPlay.doSomething(new Play<RankGame>());
    }

    public void doSomething(Play<? super Lol> play) {
        System.out.println(play);
    }

}
