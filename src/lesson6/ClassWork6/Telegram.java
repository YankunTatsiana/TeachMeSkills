package lesson6.ClassWork6;

public class Telegram implements Application, Messenger {
    @Override
    public void turnOn() {
        System.out.println("Telegram turned On");
    }

    @Override
    public void turnOff() {
        System.out.println("Telegram turned Off");
    }

    @Override
    public void sendMessenger() {
        System.out.println("Send messenger by Telegram");
    }

    @Override
    public void getMessenger() {
        System.out.println("Getting messenger from Telegram");
    }
}
