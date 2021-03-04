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

//    public String getCarInsuranceName(Person person) {
//        
//    }

    public static void main(String[] args) {
        // TODO: Optional 생성 2021/03/04 10:28 오후
        Person person = new Person();
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
