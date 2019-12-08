package test;

public class B extends A{
    private int num;
    private String str;

    public B(int num, String str, A a) {
        //super(a);

        this.num = num;
        this.str = str;
    }

    @Override
    int test1() {
        return 0;
    }
}
