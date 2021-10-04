package by.yankun.tasks.Lesson7.Figure;

public class FigureMain {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("Red", 90, 4) {
            @Override
            void draw() {

            }
        };
        shapes[1] = new Rectangle("Greed", 88, 65) {
            @Override
            void draw() {

            }
        };
        System.out.println(shapes[1].toString() + " and " + shapes[0].toString());
    }
}

