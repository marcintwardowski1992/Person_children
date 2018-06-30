package pl.mtwa.parent_children.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Person {

    private String name;
    private String surname;
    private int age;
    private AdultOrChildren adultOrChildren;
    private Sex sex;
    private Set<Person> children = new HashSet<>();


    public Person(String name, String surname, int age, AdultOrChildren adultOrChildren, Sex sex, Set<Person> children) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adultOrChildren = adultOrChildren;
        this.sex = sex;
        this.children = children;
    }

    public Person(String name, String surname, int age, AdultOrChildren adultOrChildren) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adultOrChildren = adultOrChildren;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AdultOrChildren getAdultOrChildren() {
        return adultOrChildren;
    }

    public void setAdultOrChildren(AdultOrChildren adultOrChildren) {
        this.adultOrChildren = adultOrChildren;
    }

    public Set<Person> getChildren() {
        return children;
    }

    public void setChildren(Set<Person> children) {
        this.children = children;
    }

    public void addChild(Person child){
        children.add(child);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", adultOrChildren=" + adultOrChildren +
                ", sex=" + sex +
                ", children=" + children +
                '}';
    }
}
