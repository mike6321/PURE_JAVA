package me.designpattern.i_bridge;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 6:38 오후
 */
public class Main {
    public static void main(String[] args) {
        PrintMorseCode code = new PrintMorseCode();
//        code.j();
//        code.u();
//        code.n();
//        code.w();
//        code.o();
//        code.o();

        code.j().u().n().w().o().o();
    }
}
