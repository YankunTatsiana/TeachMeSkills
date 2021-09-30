package Lesson7.Homework;

public class Air extends Transport {
    private double wingspan;
    private double minRunwayLength;

    public Air(int power, double maxSpeed, double weight, String model, double wingspan, double minRunwayLength) {
        super(power, maxSpeed, weight, model);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    public double getWingspan() {
        return wingspan;
    }

    public double getMinRunwayLength() {
        return minRunwayLength;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public void setMinRunwayLength(double minRunwayLength) {
        this.minRunwayLength = minRunwayLength;
    }
}
