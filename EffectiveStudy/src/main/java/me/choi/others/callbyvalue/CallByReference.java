package me.choi.others.callbyvalue;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 4:49 오후
 */
public class CallByReference {

    public static void swap(Person person) {
        person = new Person("jwdeveloper", 30);
    }


    public static void main(String[] args) {
        Person person = new Person("junwoo", 30);

        System.out.println(person.toString());
        swap(person);
        System.out.println(person.toString());
    }
}
class Person {


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
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
