package by.yankun.tasks.Lesson7.Homework;

public class Transport {
    private int power;
    private double maxSpeed;
    private double weight;
    private String model;
    private double powerKW;


    public Transport(int power, double maxSpeed, double weight, String model) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Transport(double powerKW) {
        this.powerKW = powerKW;
    }

    public double getPowerKW() {
        return powerKW;
    }

    public void setPowerKW(double powerKW) {
        this.powerKW = powerKW;
    }

    double newPower() {
        double i = 0.74;
        return getPower() * 0.74;
    }
}
