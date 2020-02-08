package me.choi.others.overriding;

public class GrandMother {

    public void onCreate() {
        System.out.println("나는 할머니다.");
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals ...");
        return super.equals(obj);
    }
}
