package me.choi.exception;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment : 커스텀 예외 만들기
 * Time : 3:29 오후
 */
public class CustomException extends RuntimeException{
    public CustomException(String message, Throwable cause) {
        // TODO: [CustomException] junwoochoi 2021/01/19 3:33 오후
        /**
         * 항상 root cause에 해당하는 예외를 담아서 전송해야한다.
         * */
        super(message, cause);
    }
}
class CustomExampleProcessor {
    public static void main(String[] args) {
        try (MyStream myStream = new MyStream();){
            System.out.println(1/0);
        } catch (Throwable e) {
            throw new CustomException("성아 사랑해", e);
        } finally {
            System.out.println("Hello");
        }
    }
}
