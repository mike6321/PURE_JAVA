package me.choi.stream;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 11:19 오후
 */
public class VariableCapture {

    public void testMethod(final String myFinalString01, String myString01) {
        final String myFinalString02 = "myFinalString02";
        String myString02 = "myString02";

        class VariableCaptureTest {
            void print() {
                System.out.println(myFinalString01 + " : " + myFinalString02);
                System.out.println(myString01 + " : " + myFinalString02);
            }
        }
        new VariableCaptureTest().print();
    }

    public static void main(String[] args) {
        VariableCapture variableCapture = new VariableCapture();
        variableCapture.testMethod("myFinalString01", "myString02");
    }
}
