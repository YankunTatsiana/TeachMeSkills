package by.yankun.tasks.Lesson7.Homework;

public class War extends Air {
    private boolean ejectionSystem;
    private int numberOfMissiles;
    private int factMissiles;

    public War(int power, double maxSpeed, double weight, String model, double wingspan, double minRunwayLength, boolean ejectionSystem, int numberOfMissiles, int factMissiles) {
        super(power, maxSpeed, weight, model, wingspan, minRunwayLength);
        this.ejectionSystem = ejectionSystem;
        this.numberOfMissiles = numberOfMissiles;
        this.factMissiles = factMissiles;
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public void setNumberOfMissiles(int numberOfMissiles) {
        this.numberOfMissiles = numberOfMissiles;
    }

    public int getFactMissiles() {
        return factMissiles;
    }

    public void displayInfo() {
        System.out.println("Обьект мощностью " + getPower() + " л.с.(" + newPower() + " кВ.) макс. скоростью " + getMaxSpeed() + "км/ч, массой " + getWeight() + " кг. " + "Марка объекта: " + getModel() + ". Размех крыльев: " + getWingspan() + "м. Мин. длина взлетной полосы: " + getMinRunwayLength() + "метров. Наличие системы катапультирования:  " + isEjectionSystem() + ". Кол-во ракет на борту: " + getNumberOfMissiles());

    }

    public void shot() {
        if (factMissiles > 0)
            System.out.println("Ракета пошла ... ");
        else
            System.out.println("Боеприпасы отсутствуют");
    }

    public void factEjectionSystem() {
        if (ejectionSystem == true)
            System.out.println("Катапультирование прошло успешно!");
        else if (ejectionSystem == false)
            System.out.println("У вас нет такой системы! Пу,пу,пу.. Успехов!)");
    }
}
