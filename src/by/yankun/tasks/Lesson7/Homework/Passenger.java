package by.yankun.tasks.Lesson7.Homework;

public class Passenger extends Ground {
    private String bodyType;
    private int numberOfPassenger;
    private double time;

    public Passenger(int power, double maxSpeed, double weight, String model, int numberOfWheels, double fuelConsumption, String bodyType, int numberOfPassenger, double time) {
        super(power, maxSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassenger = numberOfPassenger;
        this.time = time;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public void displayInfo() {
        System.out.println("Обьект мощностью " + getPower() + " л.с. (" + newPower() + " кВ.), макс. скоростью " + getMaxSpeed() + "км/ч, массой " + getWeight() + " кг. " + "Марка объекта: " + getModel() + ". Количество колес: " + getNumberOfWheels() + ". Расход топлива: " + getFuelConsumption() + "л/100км. Тип кузова обьекта: " + getBodyType() + ". Кол-во пассажиров: " + getNumberOfPassenger());

    }


    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    double maxdistance() {
        return getTime() * getMaxSpeed();
    }

    private double expenditure() {
        return getFuelConsumption() * (maxdistance() / 100);
    }

    public void displayInfo2() {
        System.out.println("За время " + getTime() + "ч, автомобиль " + getModel() + ", двигаясь с макисмальной скоростью " + getMaxSpeed() + " км/ч, проедет " + maxdistance() + " км и израсходует " + expenditure() + " литров топлива.");

    }
}
