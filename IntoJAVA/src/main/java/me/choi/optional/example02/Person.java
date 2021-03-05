package me.choi.optional.example02;

import java.util.Optional;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:12 오후
 */
public class Person {
    private Optional<Car> car;

    public Optional<Car> getCar() {
        return car;
    }

    public String getCarInsuranceName(Optional<Person> person) {
//        Optional<Person> optPerson = Optional.of(person);
        // TODO: 컴파일되지 않음 2021/03/04 10:35 오후
//        optPerson.map(Person::getCar).map(Car::getInsurance).map(Insurance::getName);

        return person.flatMap(Person::getCar)
                        .flatMap(Car::getInsurance)
                        .map(Insurance::getName).orElse("UnKnown");
    }

    public static void main(String[] args) {
        Person p = new Person();
        // TODO: Optional 생성 2021/03/04 10:28 오후
        Optional<Person> person = Optional.of(p);
        p.getCarInsuranceName(person);
    }
}

class Car {
    private Optional<Insurance> insurance;

    public Optional<Insurance> getInsurance() {
        return insurance;
    }
}

class Insurance {
    private String name;

    public String getName() {
        return name;
    }
}
