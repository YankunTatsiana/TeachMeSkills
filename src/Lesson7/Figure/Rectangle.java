package Lesson7.Figure;

import java.util.Objects;

public abstract class Rectangle extends Shape {
    private double x1;
    private double y1;

    public Rectangle(String color, double x1, double y1) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.x1, x1) == 0 && Double.compare(rectangle.y1, y1) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x1, y1);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                '}';
    }
}
