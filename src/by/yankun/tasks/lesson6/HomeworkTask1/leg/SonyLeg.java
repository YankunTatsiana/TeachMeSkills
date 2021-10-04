package by.yankun.tasks.lesson6.HomeworkTask1.leg;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }


    @Override
    public void step() {
        System.out.println("Нога поднимается");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
