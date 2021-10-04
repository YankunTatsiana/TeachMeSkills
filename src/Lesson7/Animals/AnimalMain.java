package Lesson7.Animals;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Tosha", "bones", "Minsk", "Doberman");
        animals[1] = new Cat("Kody", "Catfood", "Grodno", "British");
        animals[2] = new Horse("Orlik", "Apple", "Gomel", "Loshad");
        for (int i = 0; i < animals.length; i++) {
            System.out.println("На прием пришел: " + animals[i].toString());

        }
    }
}