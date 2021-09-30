package by.yankun.tasks;

public class Person {
    String fullName;
    int age;

    void move() {
        System.out.println(fullName + " двигается.");
    }

    void talk() {
        System.out.println(fullName + " говорит.");
    }

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}
