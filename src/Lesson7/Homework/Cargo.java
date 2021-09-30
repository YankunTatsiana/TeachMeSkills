package Lesson7.Homework;

public class Cargo extends Ground {
    private double loadCapacity;
    private double loading;

    public Cargo(int power, double maxSpeed, double weight, String model, int numberOfWheels, double fuelConsumption, double loadCapacity, double loading) {
        super(power, maxSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
        this.loading = loading;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getLoading() {
        return loading;
    }

    public void setLoading(double loading) {
        this.loading = loading;
    }

    public void displayInfo() {
        System.out.println("Обьект мощностью " + getPower() + " л.с.(" + newPower() + " кВ.) макс. скоростью " + getMaxSpeed() + "км/ч, массой " + getWeight() + " кг. " + "Марка объекта: " + getModel() + ". Количество колес: " + getNumberOfWheels() + ". Расход топлива: " + getFuelConsumption() + "л/100км. Грузоподьемностью:  " + getLoadCapacity() + " тонн.");

    }

    public void maxLoading() {
        if (loading > loadCapacity)
            System.out.println("Вам нужен грузовик побольше!");
        else
            System.out.println("Грузовик загружен!");
    }

}
