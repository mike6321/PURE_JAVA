package me.choi.others.callbyvalue;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 4:49 오후
 */
public class CallByReference2{

    public static void swap(Person person0, Person person1) {
        String temp = person0.getName();
        person0.setName(person1.getName());
        person1.setName(temp);
    }


    public static void main(String[] args) {
        Person person0 = new Person("junwoo", 30);
        Person person1 = new Person("jwdeveloper", 30);

        System.out.println("[person0]"+person0.toString());
        System.out.println("[person1]"+person1.toString());

        swap(person0, person1);
        System.out.println();
        System.out.println("<<<<<<<<<<<<<<<<<SWAP>>>>>>>>>>>>>>>>>>>>");
        System.out.println();

        System.out.println("[person0]"+person0.toString());
        System.out.println("[person1]"+person1.toString());
    }
}

class Person2 {


    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
