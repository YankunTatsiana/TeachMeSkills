//package Package1;
//
//public class AdditionHomework2 {
//Task 1.1
//    public static void main(String[] args) {
//        int a = 10;
//        int result = 0;
//        for (int i = 1; a >= 10 && a <= 20; a++) {
//            result = a * a;
//            System.out.println(result);
//        }
//    }
//Task 1.2
//    public static void main(String[] args) {
//        int a = 25;
//        if (a >= 5 && a <= 155) {
//            System.out.println("число попало в отрезок, но не попало в интервал");
//        }
//        if (a > 25 && a < 100) {
//            System.out.println("число попало в отрезок и интервал");
//        }
//        if (a < 5 || a > 155) {
//            System.out.println("число НЕ попало в интервали НЕ попало в отрезок");
//        }
//
//
//    }
// Task 1.2/2
//    public static void main(String[] args) {
//        int a = 0;
//        for (int i = 1; a >= 5 && a <= 155 && a > 25 && a < 100; ) {
//            System.out.println("Число попало в отрезок и в интервал");
//            break;
//        }
//        if (a <= 25 || a >= 100) {
//            for (int v = 1; a >= 5 && a <= 155; ) {
//                System.out.println("Число попало в отрезок, но не попало в интервал");
//                break;
//            }
//        }
//        if (a < 5 || a > 155) {
//            System.out.println("Число НЕ попало в отрезок и НЕ попало в интервал");
//        }
//    }
//}
// Task 1.3
//    public static void main(String[] args) {
//        int a = 10;
//        if (a == 10) {
//            System.out.println("Верно");
//        } else {
//            System.out.println("Неверно");
//        }
//    }
//Task 1.4
//    public static void main(String[] args) {
//        int min = 45;
//        if (0 <= min && min <= 14) {
//            System.out.println("в 1ю четверть");
//        } else if (min > 14 && min <= 29) {
//            System.out.println("во 2ю четверть");
//        } else if (min > 29 && min <= 44) {
//            System.out.println("в 3ю четверь");
//        } else if (min > 44 && min <= 59) {
//            System.out.println("в 4ю четверть");
//        }
//    }
// Task 1.5
//    public static void main(String[] args) {
//        int num = 1;
//        String result = "";
//        switch (num) {
//            case 1:
//                System.out.println("Зима" + result);
//                break;
//            case 2:
//                System.out.println("Весна" + result);
//                break;
//            case 3:
//                System.out.println("Лето" + result);
//                break;
//            case 4:
//                System.out.println("Осень" + result);
//                break;
//        }
//    }
//
//Task 2.1
//    public static void main(String[] args) {
//        int a = 123;
//        int b = 100;
//        int c = 0;
//        int d = 0;
//        int e = 0;
//        if (a > 100 && a < 999) ;
//        {
//            if (a > 100 && a < 999) ;
//            c = a / b;
//            System.out.println(c);
//            if (a > 100 && a < 999) ;
//            d = (a - b) / (b / 10);
//            System.out.println(d);
//            if (a > 100 && a < 999) ;
//            e = (a - b - 10) / (b / 110);
//            System.out.println(e);
//            System.out.println ("%d%d%d\n", e, d, c );}
//    }
//    Task 2.1
//    public static void main(String[] args) {
//        int a=7654321;
//    int digit = a %10;
//    a = a / 10;
//    if(digit < a % 10)
//        if (a>0);
//        int a1=a%10;
//        int a2=((a%100)-a1)/10;
//        int a3=((a%1000)-(a2*10)-a1)/100;
//        int a4=((a%10000)-(a3*100)-(a2*10)-a1)/1000;
//        int a5=((a%100000)-(a4*1000)-(a3*100)-(a2*10)-a1)/10000;
//        int a6=((a%1000000)-(a5*10000)-(a4*1000)-(a3*100)-(a2*10)-a1)/100000;
//        int a7=(a-(a6*100000)-(a5*10000)-(a4*1000)-(a3*100)-(a2*10)-a1)/1000000;
//        System.out.printf("%d%d%d%d%d%d%d\n", a1, a2,a3, a4, a5, a6, a7);
//    }
//    Task 2.2
//    public static void main(String[] args) {
//        int a = 921;
//        if (a > 0) ;
//        int a1 = a % 10;
//        int a2 = ((a % 100) - a1) / 10;
//        int a3 = ((a % 1000) - (a2 * 10) - a1) / 100;
//        int a4 = (a - (a3 * 100) - (a2 * 10) - a1) / 1000;
//        if (a4 > a3 && a3 > a2 && a2 > a1)
//            System.out.println("Условие выполняется, числа находятся в убывающей последовательности");
//        else if (a4 < a3 && a3 < a2 && a2 < a1)
//            System.out.println("Условие выполняется, числа находятся в возростающей последовательности");
//        else
//            System.out.println("Условие не выполняется");
//
//    }
//Task2.3
//    public static void main(String[] args) {
//        int age = 301;
//        int heads = 3;
//        int eyes = 2;
//        if (age >= 0)
//        {
//            if (age >= 0 && age < 200)
//            heads += (3 * age);
//            else if (age >= 200 && age <= 300)
//            heads += ((2 * age) + (3 * 199));
//            else if (age > 300)
//            heads += ((1 * age) + (2 * 101) + (3 * 199));
//        }
//        eyes = heads * 2;
//        System.out.println("В возрасте " + age + " у чудища будет " + heads + " голов и " + eyes + " глаз");
//
//    }
//











