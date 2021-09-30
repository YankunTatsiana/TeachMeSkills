package lesson6.HomeworkTask1.hands;

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Рука поднимается и машет");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
