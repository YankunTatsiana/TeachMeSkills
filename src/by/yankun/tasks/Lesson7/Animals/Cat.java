package by.yankun.tasks.Lesson7.Animals;

public class Cat extends Animal {
    private String catType;

    public Cat(String name, String food, String location, String catType) {
        super(name, food, location);
        this.catType = catType;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Мяуу!Иуу! Урр!!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Кот ест.");
    }

    @Override
    public String toString() {
        return "Cat: " + catType;
    }
}
