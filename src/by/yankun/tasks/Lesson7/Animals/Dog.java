package by.yankun.tasks.Lesson7.Animals;

public class Dog extends Animal {
    private String dogType;

    public Dog(String name, String food, String location, String dogType) {
        super(name, food, location);
        this.dogType = dogType;
    }

    public String getDogType() {
        return dogType;
    }

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Гаввв!");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест:");
    }

    @Override
    public String toString() {
        return "Dog: " + dogType;
    }
}
