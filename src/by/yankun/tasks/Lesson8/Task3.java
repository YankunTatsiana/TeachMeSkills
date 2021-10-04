package by.yankun.tasks.Lesson8;

public class Task3 {
    //    В исходном файле находятся слова, каждое слово на новой строке. После
//    запуска программы должен создать файл, который будет содержать в себе
//    только полиндромы
    public static void main(String[] args) {
        int r;
        String string = "В этой строке будут слова мадам тут наворован шашлык";
        string.replace("\\W+", " ");
        String[] strings = string.split(" ");
        System.out.println("Исходный текст: ");
        for (String ss : strings) {
            System.out.println(ss);
        }
        System.out.println("Палиндромы: ");

        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.reverse();
        boolean result = string.equalsIgnoreCase(String.valueOf(stringBuffer));
        if (true) {
            System.out.println(stringBuffer);
        }
        if (false) {
            System.out.println("null");
        }
        r = string.compareTo(String.valueOf(stringBuffer.reverse()));
        if (r == 0)
            System.out.println(stringBuffer.reverse());
        else if (r < 0) ;
        System.out.println("null");
    }
}




