package by.yankun.tasks.Lesson7.Cars;

public class Lorry extends Car {
    private double bodyLiftingCapacity;

    public Lorry(String carModel, String carClass, double weight, Driver driver, Engine engine, double bodyLiftingCapacity) {
        super(carModel, carClass, weight, driver, engine);
        this.bodyLiftingCapacity = bodyLiftingCapacity;
    }

    public double getBodyLiftingCapacity() {
        return bodyLiftingCapacity;
    }
}
