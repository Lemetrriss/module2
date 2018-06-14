package classWork.theme_2_8;

public class Square extends Shape {

    public Square(double side, String name) {
        super(side, name);
    }

    @Override
    public double calcArea() {
        return getSize()*getSize();
    }

    @Override
    public String toString() {
        return "Square " + getSize() + ", name - " + getName() + ", area = " + calcArea();
    }
}
