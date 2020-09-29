package com;


// I think that for resolving task i should use setters and getters
public class Cycling_problem_1 {
    public static void main(String[] args) {
        Person person = new Person("parent", 12);
        person.setUser(new User("child", 12));
        System.out.println(person.getUser());
        System.out.println(person.toString());
    }
}


class User extends Person {

    public User(String name, int age) {
        super(name, age);
    }

}


class Person {
    private String name;
    private int age;
    private User user;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", user=" + user +
                '}';
    }
}

