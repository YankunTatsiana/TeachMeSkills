//package Lesson3;
//
//
//import java.util.Random;
//
//public class HomeWork3 {
//    //    Task 3.1
////    public static void main(String[] args) {
////        int[] cake = new int[10];
////        int mass = 2;
////            for (int i = 0; i < cake.length; i++) {
////            cake[i] = mass;
////            mass+=2;
////            System.out.println(cake[i]);
////        }
////    }
//    //    Task 3.2
//    public static void main(String[] args) {
//        int[] cake = new int[50];
//        int mass = 1;
//        for (int i = 0; i < cake.length; i++) {  //почему используем cake.length, а не cake int [50]?
//            cake[i] = mass;
//            mass += 2;
//            System.out.print(cake[i] + " ");
//
//        }
//        System.out.println();
//        int save;
//        boolean sorted = false;
//        while (!sorted) {
//            sorted = true;
//            for (int i = 0; i < cake.length - 1; i++) {
//                if (cake[i] < cake[i + 1]) {
//                    save = cake[i];
//                    cake[i] = cake[i + 1];
//                    cake[i + 1] = save;
//                    sorted = false;
//                }
//            }
//        }
//        for (int i : cake) {
//            System.out.print(i + " ");
//        }
//    }
////    Task 3.3
//    public static void main(String[] args) {
//        int[] cake = new int[15];
//        Random r = new Random();
//        int evencout = 0;
//        int oddcout = 0;
//        for (int i = 0; i < cake.length; i++) {
//            cake[i] = r.nextInt(100);
//            System.out.print(cake[i] + " ");
//            if (cake[i] % 2 == 0) {
//                evencout++;                             //разобраться как работает данная операция
//            } else {
//                oddcout++;
//            }
//        }
//
//        System.out.println();
//        System.out.print("Четное кол-во элементов данного массива " + evencout);
//
//    }
//    //    Task 3.4
//    public static void main(String[] args) {
//        int[] cake = new int[20];
//        Random random = new Random();
//        for (int i = 0; i < cake.length-1; i++) {     // нужно ли ставить длмна массива минус 1?
//            cake[i] = random.nextInt(21);
//        }
//        for (int value : cake) {
//            System.out.print(value + " ");            // почему используем value?
//        }
//        System.out.println();
//        System.out.println("------------------------------------------------");
//        for (int i = 0; i < cake.length; i++) {
//            if (i % 2 != 0) {
//                cake[i] = 0;
//            }
//        }
//        for (int value : cake) {
//            System.out.print(value + " ");
//        }
//    }
// Task 3.5                                               // уточнить как проставить округление до целого верного числа либо для double
//    public static void main(String[] args) {
//        int[] cake = new int[5];
//        int summ1 = 0;
//        Random random = new Random();
//        for (int i = 0; i < cake.length; i++) {
//            cake[i] = random.nextInt(16);
//            System.out.print(cake[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < cake.length; i++) {
//            summ1 += cake[i];
//        }
//        if (summ1 > 0) ;
//        {
//            summ1 = summ1 / cake.length;
//        }
//        System.out.print("Среднее арифметическое элементов первого массива " + summ1);
//
//        System.out.println();
//
//        int[] cookie = new int[5];
//        int summ2 = 0;
//        Random random2 = new Random();
//        for (int i = 0; i < cookie.length; i++) {
//            cookie[i] = random.nextInt(16);
//            System.out.print(cookie[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < cookie.length; i++) {
//            summ2 += cookie[i];
//        }
//        if (summ2 > 0) ;
//        {
//            summ2 = summ2 / cookie.length;
//        }
//        System.out.print("Среднее арифметическое элементов второго массива " + summ2);
//        System.out.println();
//        System.out.println();
//        if (summ1 > summ2) {
//            System.out.print("Среднее арифметическое первого массива больше, чем второго");
//        } else if (summ1 < summ2) {
//            System.out.print("Среднее арифметическое второго массива больше, чем первого");
//        } else {
//            System.out.print("Среднее арифметическое первого массива равно среднему арифметическому второго массива");
//        }
//
//    }
//Task 3.6
//    public static void main(String[] args) {
//        int[] kody = new int[4];
//        Random random = new Random();
//        for (int i = 0; i < kody.length; i++) {
//            kody[i] = random.nextInt(11);
//            System.out.print(kody[i] + " ");
//
//            if (kody[i] < kody[i + 1]) {                       // не идет дальше расчет. работает только в цикле for
//                System.out.print("Массив является строго возрастающим");
//            } else {
//                System.out.print("Массив не ялвяется строго возрастающим");
//            }
//        }
//
//    }
//Task 3.7
//    public static void main(String[] args) {
//        Random random = new Random();
//        int[] kody = new int[12];
//        for (int i = 0; i < kody.length; i++) {
//            kody[i] = random.nextInt(16);
//            System.out.print(kody[i] + " ");
//        }
//        int max = kody[0];
//        int index = 0;
//        for (int i = 0; i < kody.length; i++) {
//            if (kody[i] > max) ;
//            {
//                max = kody[i];
//                index = i;
//            }
//        }
//        System.out.println();
//        System.out.println("Максимальное значение массива " + max);
//        System.out.println("Индекс массива с максимальным значением" + index);
//
//    }
//}








