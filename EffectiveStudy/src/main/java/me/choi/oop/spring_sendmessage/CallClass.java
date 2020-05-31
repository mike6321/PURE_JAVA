package me.choi.spring_sendmessage;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/29
 * Time : 9:23 오후
 */
public class CallClass {
    private DefaultClass defaultClass;

    public CallClass(DefaultClass defaultClass) {
        this.defaultClass = new DefaultClass();
    }

    public void SendMessage() {
        this.defaultClass.shouldSkip();
        System.out.println("complete send message");
    }

    public static void main(String[] args) {
        DefaultClass defaultClass = null;

        CallClass callClass = new CallClass(defaultClass);
        callClass.SendMessage();
    }
    //    public CallClass() {
//        this.defaultClass.shouldSkip();
//    }
}

