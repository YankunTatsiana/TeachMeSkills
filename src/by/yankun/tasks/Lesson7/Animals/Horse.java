package by.yankun.tasks.Lesson7.Animals;

public class Horse extends Animal {
    private String horseType;

    public Horse(String name, String food, String location, String horseType) {
        super(name, food, location);
        this.horseType = horseType;
    }

    public String getHorseType() {
        return horseType;
    }

    public void setHorseType(String horseType) {
        this.horseType = horseType;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Игого!!!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Лошадь ест.");
    }

    @Override
    public String toString() {
        return "Horse: " + horseType;
    }
}
