package me.choi.exception;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 12:48 오후
 */
public class Example {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        }
//        catch (RuntimeException e) {
//
//        }
        // TODO: [IllegalArgumentException] junwoochoi 2021/01/19 1:02 오후
        /**
         * 하위 예외 클래스를 하위 catch 블록의 아규먼트로 사용하면 안된다. (위에서 이미 처리했기 때문에)
         * */
//        } catch (IllegalArgumentException e) {
//
//        }

        // TODO: [MultiCatchBlock] junwoochoi 2021/01/19 1:20 오후
        /**
         * 자바 1.7 부터 가능
         * 이것 또한 같은 레벨의 자식들이어야 가능하지 상속 관계면 불가능하다.
         * try 블록에서 어떤 예외를 던지느냐에 따라 해당하는 Exception을 잡는다.
         * */
//        catch (IllegalAccessError | IllegalArgumentException e) {
//            System.out.println("");
//        }
//        catch (RuntimeException | IllegalArgumentException e) {
//            System.out.println("");
//        }
        catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getClass());
        }

    }
}
