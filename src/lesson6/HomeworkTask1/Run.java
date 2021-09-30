//package lesson6.HomeworkTask1;
//
//import .robot.hands.IHand;
//import by.teachmeskills.robot.hands.SonyHand;
//import by.teachmeskills.robot.heads.IHead;
//import by.teachmeskills.robot.heads.SonyHead;
//import by.teachmeskills.robot.leg.ILeg;
//import by.teachmeskills.robot.leg.SonyLeg;
//
//public class Run {
//    public static void main(String[] args) {
//        /*
//        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
//        Класс SonyHead является примером реализацией головы от Sony.
//        Создайте 3 робота с разными комплектующими.
//        Например у робота голова и нога от Sony а, рука от Samsung.
//        У всех роботов вызовите метод action.
//        Среди 3-х роботов найдите самого дорогого.
//        */
//        IHead sonyHead = new SonyHead(100);
//        ILeg sonyLeg = new SonyLeg(90);
//        IHand sonyHand = new SonyHand(880);
//        Robot robot = new Robot(sonyHead,sonyHand, sonyLeg);
//        robot.action();
//        int price = robot.getPrice();
//        System.out.println(price);
//
//    }
//}
