package test3;

class Parent {
    private int money;
    private String name;


    public Parent(int money, String name) {
        this.money = money;
        this.name = name;
    }
}
class Child extends Parent{

    public Child(int money, String name) {
        super(money, name);
    }
}

class Main {
    public static void main(String[] args) {

    }
}

