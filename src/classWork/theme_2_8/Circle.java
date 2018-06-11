package classWork.theme_2_8;

public class Circle extends Shape {

    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double calcArea() {
        return Math.PI*getSize()*getSize();
    }

    @Override
    public String toString() {
        return "Circle " + getSize() + " area = " + calcArea();
    }
}
