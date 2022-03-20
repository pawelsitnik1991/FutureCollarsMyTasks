package Lesson4.PersonClass;

import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private double growth;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.growth, growth) == 0 && age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, growth, age);
    }
}
