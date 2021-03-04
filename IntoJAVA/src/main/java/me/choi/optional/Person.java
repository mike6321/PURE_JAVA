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
        // TODO: NPE가 발생하지 않도록 코드수정 2021/03/04 10:20 오후
        if (person != null) {
            Car car = person.getCar();

            if (car != null) {
                Insurance insurance = car.getInsurance();

                if (insurance != null) {
                    return insurance.getName();
                }
            }
        }
        return "UnKnown";
        //return person.getCar().getInsurance().getName();
    }

    public static void main(String[] args) {
        // TODO: NPE 발생 2021/03/04 10:16 오후
        Person person = new Person();
        String carInsuranceName = person.getCarInsuranceName(new Person());
        System.out.println(carInsuranceName);
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
