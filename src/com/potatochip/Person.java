package com.potatochip;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    String first_name;
    String last_name;
    Car[] cars;
    Dog[] dogs;

    public Person() {
    }

    public Person(String first_name, String last_name, Car[] cars, Dog[] dogs) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.cars = cars;
        this.dogs = dogs;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public Dog[] getDogs() {
        return dogs;
    }

    public void setDogs(Dog[] dogs) {
        this.dogs = dogs;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", cars=" + Arrays.toString(cars) +
                ", dogs=" + Arrays.toString(dogs) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(first_name, person.first_name) && Objects.equals(last_name, person.last_name) && Arrays.equals(cars, person.cars) && Arrays.equals(dogs, person.dogs);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(first_name, last_name);
        result = 31 * result + Arrays.hashCode(cars);
        result = 31 * result + Arrays.hashCode(dogs);
        return result;
    }
}
