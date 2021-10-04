package by.yankun.tasks.lesson6.ClassWork6;

public class Viber implements Application, Messenger {
    @Override
    public void turnOn() {
        System.out.println("Viber turned On");
    }

    @Override
    public void turnOff() {
        System.out.println("Viber turned Off");
    }

    @Override
    public void sendMessenger() {
        System.out.println("Send messenger by Viber");
    }

    @Override
    public void getMessenger() {
        System.out.println("Getting messenger from Viber");
    }
}
