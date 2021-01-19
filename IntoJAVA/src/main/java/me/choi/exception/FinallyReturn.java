package me.choi.exception;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 4:20 오후
 */
public class FinallyReturn {
    public static void main(String[] args) {
        FinallyReturn finallyReturn = new FinallyReturn();
        StringBuilder print = finallyReturn.print();
        System.out.println(print);
    }
    public StringBuilder print() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("Hi");
            sb.append(" My name is ");
            String name = "123";
            sb.append(name);

            return sb;
        } catch (Exception e) {
            sb.append(" catch pass");

            return sb;
        } finally {
            sb.append(" finally pass");

            return sb;
        }
    }
}
