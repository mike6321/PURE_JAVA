package me.choi.inheritance.overloading;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:41 오후
 */
public class Overloading {
    public void getOverloading(A a) {
        System.out.println("A");
    }
    public void getOverloading(B b) {
        System.out.println("B");
    }
    public void getOverloading(C c) {
        System.out.println("C");
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.getOverloading(new A() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });

        overloading.getOverloading(new B());
        overloading.getOverloading(new C());

    }
}
