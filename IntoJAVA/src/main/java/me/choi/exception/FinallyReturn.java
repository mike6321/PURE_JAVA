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
        // TODO: [Finally Return] junwoochoi 2021/01/19 4:29 오후
        /**
         * finally block에 리턴이 있으면 try block에 있는 return 을 수행하지 않는다.
         * 안티패턴이므로 사용하지 말자!
         * */
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("Hi");
            sb.append(" My name is ");
            String name = "junwoo";
            sb.append(name);
            //throw new IllegalArgumentException();
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
