package by.yankun.tasks.Lesson7.Homework;

public class TransportMain {
    public static void main(String[] args) {
        Passenger p1 = new Passenger(252, 189.7, 1546.8, "Audi", 4, 6.9, "sedan", 8, 2.5);
        p1.displayInfo();
        p1.displayInfo2();
        Cargo c1 = new Cargo(675, 95.9, 5908.8, "Belaz", 8, 45.4, 15, 15);
        c1.displayInfo();
        c1.maxLoading();
        Civil c2 = new Civil(1564, 1200.9, 56743.9, "Boing 747", 150, 1500, 300, true, 200);
        c2.displayInfo();
        c2.maxAirLoading();
        War w1 = new War(1000, 1900, 18500, "CY -57", 28, 1000, false, 5, 0);
        w1.displayInfo();
        w1.shot();
        w1.factEjectionSystem();

    }
}
