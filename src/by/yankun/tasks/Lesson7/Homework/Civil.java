package by.yankun.tasks.Lesson7.Homework;

public class Civil extends Air {
    private int airNumberOfPassengers;
    private boolean availabilityOfBusinessClass;
    private int factAirNumberOfPassengers;

    public Civil(int power, double maxSpeed, double weight, String model, double wingspan, double minRunwayLength, int airNumberOfPassengers, boolean availabilityOfBusinessClass, int factAirNumberOfPassengers) {
        super(power, maxSpeed, weight, model, wingspan, minRunwayLength);
        this.airNumberOfPassengers = airNumberOfPassengers;
        this.availabilityOfBusinessClass = availabilityOfBusinessClass;
        this.factAirNumberOfPassengers = factAirNumberOfPassengers;
    }

    public int getAirNumberOfPassengers() {
        return airNumberOfPassengers;
    }

    public boolean getAvailabilityOfBusinessClass() {
        return availabilityOfBusinessClass;
    }

    public void setAirNumberOfPassengers(int airNumberOfPassengers) {
        this.airNumberOfPassengers = airNumberOfPassengers;
    }

    public void setAvailabilityOfBusinessClass(boolean availabilityOfBusinessClass) {
        this.availabilityOfBusinessClass = availabilityOfBusinessClass;
    }

    public int getfactAirNumberOfPassengers() {
        return factAirNumberOfPassengers;
    }

    public void setfactAirNumberOfPassengers(int factAirNumberOfPassengers) {
        this.factAirNumberOfPassengers = factAirNumberOfPassengers;
    }

    public void displayInfo() {
        System.out.println("Обьект мощностью " + getPower() + " л.с.(" + newPower() + ") макс. скоростью " + getMaxSpeed() + "км/ч, массой " + getWeight() + " кг. " + "Марка объекта: " + getModel() + ". Размех крыльев: " + getWingspan() + "м. Мин. длина взлетной полосы: " + getMinRunwayLength() + "метров. Кол-во пассажиров:  " + getAirNumberOfPassengers() + ". Наличие бизнес-класса: " + getAvailabilityOfBusinessClass());

    }

    public void maxAirLoading() {
        if (airNumberOfPassengers < factAirNumberOfPassengers)
            System.out.println("Вам нужен самолет побольше!");
        else
            System.out.println("Самолет загружен!");
    }
}
