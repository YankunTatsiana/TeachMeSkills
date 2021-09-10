//package Package1;
//
//public class HomeWork2 {
////        //    public static void main(String[] args) {
//////        // Task 1.1
////////    {
////////        int a = -100;
////////        if (10 > a && a > 0) {
////////            System.out.println("Это положительное однозначное число");
////////        }
////////        if (a > 9 && a < 100) {
////////            System.out.println("Это положительное двухзначное число");
////////        }
////////        if (a > 99) {
////////            System.out.println("Это положительное трехзначное число и более");
////////        }
////////        if (a < 0 && a > -10) {
////////            System.out.println("Это отрицательное однозначное число");
////////        }
////////        if (a < -9 && a > -100) {
////////            System.out.println("Это отрицательное двухзначное число");
////////        }
////////        if (a<-99) {
////////            System.out.println("Это отрицательное трехзначное число и более");
////////        }
//////    }
//////    public static void main(String[] args) {
//////        // Task 1.2
//////        int a = 1;
//////        int b = 3;
//////        int c = 5;
//////        if (a + b > c && a + c > b && b + c > a) {
//////            System.out.println("Такой треугольник существует");
//////        }
//////        else if(a + b < c || a + c < b || b + c < a) {
//////            System.out.println("Такой треугольник НЕ существует");
//////        }
//////    }
//////    // Task 1.3
//////    public static void main(String[] args) {
//////        int n = 0;
//////        if (n > 0) {
//////            System.out.println(++n);
//////        }
//////        else if (n < 0) {
//////            System.out.println(n-2);
//////        }
//////        else {
//////            System.out.println(n=10);
//////        }
//////    }
////    //Task 1.4
//////    public static void main(String[] args) {
//////        int a=1;
//////        int b=-2;
//////        int c=0;
//////        if (a>0 && b>0 && c>0) {
//////            System.out.println("все положительные");
//////        }
//////        else if (a>0 && b>0 || a>0 && c>0 || c>0 && b>0) {
//////            System.out.println("2 числа положительные");
//////        }
//////        else if (a>0 || b>0 || c>0) {
//////            System.out.println("1 одно число положительное");
//////        }
//////    }
////    //Task 1.5
//////    public static void main(String[] args) {
//////        int a = 1;
//////        int b = -9;
//////        int c = -87;
//////        if (a > 0 && b > 0 && c > 0) {
//////            System.out.println("все положительные");
//////        } else if (a > 0 && b > 0 || a > 0 && c > 0 || c > 0 && b > 0) {
//////            System.out.println("2 числа положительные");
//////        } else if (a > 0 || b > 0 || c > 0) {
//////            System.out.println("1 одно число положительное");
//////        }
//////        if (a < 0 && b < 0 && c < 0) {
//////            System.out.println("все отрицательные");
//////        } else if (a < 0 && b < 0 || a < 0 && c < 0 || c < 0 && b < 0) {
//////            System.out.println("2 числа отрицательные");
//////        } else if (a < 0 || b < 0 || c < 0) {
//////            System.out.println("1 одно число отрицательные");
//////        }
//////
//////    }
//////    // Task 1.6
//////    public static void main(String[] args) {
//////        int a=0;
//////        int b=1;
//////        if (a>b) {
//////            System.out.println(a);
//////        }
//////        else if (a<b) {
//////            System.out.println(b);
//////        }
//////        else {
//////            System.out.println("числа равны");
//////        }
//////    }
////    // Task 1.7
////    public static void main(String[] args) {
////        int a = 21;
////        if (a == 1) {
////            System.out.println(a+" Программист");
////        }
////        if (a>=2 && a<=4) {
////            System.out.println(a+" Программиста");
////        }
////        else  {
////            System.out.println(a+" Программистов");
////        }
////
////    }
////}
////
////         Task 2.1
////    public static void main(String[] args) {
////        double day1 = 10;
////        double day =2;
////        double result =day1;
////        while (day < 8) {
////            day1 = day1 * 1.1;
////            day++;
////            result = result + day1;
////        }
////        {
////            System.out.println("за 7 дней наш чувачек пробежит " + result + " км");
////        }
////
////    }
////    //Task 2.2
////    public static void main(String[] args) {
////
////        int kind = 1;
////        int hour = 3;
////        while (hour <= 24) {
////            hour += 3;
////            kind *= 2;
////            }
////        {System.out.println("Через 24 часа будет " + kind + " амеб");}
////    }
////  Task 2.3
////    public static void main(String[] args) {
////        int result = 0;
////        for (int i = 1; i <= 256; i*=2)
////        {
////            result= result+i;}
////        System.out.println("Сумма равна "+result);
////
////    }
////Task 2.4
////    public static void main(String[] args) {
////        int a = 3;
////        int b = 10;
////        int result = 0;
////        for (int i = 1; i<=a ;i++){
////            result = b+result;
////        }
////        System.out.println(result);
////    }
////Task 2.5
////    public static void main(String[] args) {
////        double d = 1;
////        double sm = 2.54;
////        double result = 0;
////        for (double i = 1; d <= 20; d++) {
////            result = sm + result;
////            System.out.println(d + " дюймов равно " + result + " сантиметров.");
////        }
////    }
////// Task 2.6
//public static void main(String[]args){
//        for(int i=2;i<=100;i+=2){
//        System.out.println(i);
//        }
//        }
//        }
// Task 2.7
//    public static void main(String[] args) {
//        int a = 1;
//        int result = a;
//        while (a < 99) {
//            a += 2;
//            result = result + a;
//        }
//        {
//            System.out.println("Сумма нечетных чисел от 1 до 99 равна " + result);
//        }
//    }
//
//        }
//   // Task 2.8.1
//    public static void main(String[] args) {
//        String a = "*";
//        String result = a;
//
//        for (int i = 1; i == 1; ) {
//            System.out.println(a);
//            break;
//        }
//        for (int i = 1; i <= 3; i++) {
//
//            result = a + result;
//            System.out.println(result);
//
//        }
//    }
//}






