package by.yankun.tasks.Lesson7.Homework;

public class Ground extends Transport {
    private int numberOfWheels;
    private double fuelConsumption;

    public Ground(int power, double maxSpeed, double weight, String model, int numberOfWheels, double fuelConsumption) {
        super(power, maxSpeed, weight, model);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
