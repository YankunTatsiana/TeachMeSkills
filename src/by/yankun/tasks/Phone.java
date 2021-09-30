package by.yankun.tasks;

public class Phone {
    int number;
    int model;
    int weight;
    String name;

//    // Отражение имени звонящего
//    void receiveCall() {
//        System.out.println("Звонит " + name);
//    }
//
//    // Возврат номера телефона
//    int getNumber() {
//        int get = number++;
//        return get;
//    }

    // Конструктор класса Phone для трех параметров
//    Phone(int n, int m, int w) {
//        number = n;
//        model = m;
//        weight = w;
//    }

    // Конструктор класса Phone для двух параметров
    Phone(int n, int m) {
        number = n;
        model = m;
    }

    //Конструктор без параметров
    Phone() {
    }

    //Вызов конструктора с тремя параметрами из конструктора с двумя параметрами
    public Phone(int n, int m, int w) {
        this(n, m);
        this.weight = w;
    }

}

