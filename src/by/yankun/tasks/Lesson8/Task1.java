package by.yankun.tasks.Lesson8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
//                последнего вхождения сивола(B).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        int text3 = text.indexOf("simply");
        int text4 = text.lastIndexOf("make");
        StringBuffer stringBuffer = new StringBuffer(text);
        stringBuffer.delete(text3, text4);
        System.out.println(stringBuffer.toString());

    }
}
