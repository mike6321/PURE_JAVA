package me.choi.optional;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:12 오후
 */
public class Person {
    private Car car;

    public Car getCar() {
        return car;
    }

    public String getCarInsuranceName(Person person) {
        return person.getCar().getInsurance().getName();
    }

    public static void main(String[] args) {
        // TODO: NPE 발생 2021/03/04 10:16 오후
        Person person = new Person();
        person.getCarInsuranceName(new Person());
    }
}

class Car {
    private Insurance insurance;

    public Insurance getInsurance() {
        return insurance;
    }
}

class Insurance {
    private String name;

    public String getName() {
        return name;
    }
}
