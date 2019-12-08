package test;

public abstract class A implements C{

    private C next;


    public A() {

    }

    @Override
    public void test2() {

    }

    public A(C next) {
        this.next = next;
    }

    abstract int test1();
}
