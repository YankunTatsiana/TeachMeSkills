package Lesson7.Animals;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println("Животное ест еду: " + animal.getFood() + ". Животное находится: " + animal.getLocation());
    }
}
