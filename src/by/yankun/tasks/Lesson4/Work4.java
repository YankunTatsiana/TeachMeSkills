//package Lesson4;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Work4 {
//    public static void main(String[] args) {
//        System.out.println("Введите размерность матрицы");
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int a;
//        a = scanner.nextInt();
//        int mass[][] = new int[a][a];
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < a; j++) {
//                mass[i][j] = random.nextInt(70);
//            }
//        }
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < a; j++) {
//                System.out.print(mass[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int summ = 0;
//        for (int i = 0; i < mass.length; i++) {
//            for (int j = 0; j < mass.length; j++) {
//                if (i == j && mass[i][j] % 2 == 0) {
//                    summ += mass[i][j];
//                }
//            }
//        }
//        System.out.println(summ);
//    }
//}
