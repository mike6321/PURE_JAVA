package me.choi.item03.version05;

public enum Elvis4 {
    INSTANCE("choi",29);

    private String name;
    private int age;

    Elvis4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Elvis4 getInstance() {
        return INSTANCE;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
