package by.yankun.tasks.Lesson7.Cars;

public class Car {
    private String carModel;
    private String carClass;
    private double weight;
    public Driver driver;
    private Engine engine;

    public Car(String carModel, String carClass, double weight, Driver driver, Engine engine) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarClass() {
        return carClass;
    }

    public double getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void start() {
        System.out.println("Поехали на" + carModel + " " + carClass + "весом: " + weight);
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот вправо");
    }

    public void turnLeft() {
        System.out.println("Поворот влево");
    }

    @Override
    public String toString() {
        return "Car:" +
                "carModel='" + carModel + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
