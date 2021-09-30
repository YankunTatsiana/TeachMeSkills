package Lesson7.Cars;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String carModel, String carClass, double weight, Driver driver, Engine engine, int maxSpeed) {
        super(carModel, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
