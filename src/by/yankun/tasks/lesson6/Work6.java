package by.yankun.tasks.lesson6;

import by.yankun.tasks.lesson6.ClassWork6.*;

public class Work6 {
    public static void main(String[] args) {
        Telegram telegram = new Telegram();
        Viber viber = new Viber();
        SmartPhone smartPhoneWithViber = new SmartPhone(viber);
        SmartPhone smartPhoneWithTelegram = new SmartPhone(telegram);
        Client clientWithViber = new Client(viber);
        Client clientWithTelegram = new Client(telegram);
        Messenger messenger = clientWithTelegram.getMessenger();
        messenger.sendMessenger();
        messenger.getMessenger();
        Application application = smartPhoneWithTelegram.getApplication();
        application.turnOff();
        application.turnOn();
        ((Messenger) application).getMessenger();
        ((Messenger) application).sendMessenger();
    }
}