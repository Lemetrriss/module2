package classWork.theme_2_8;

public class Square extends Shape {

    public Square(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return getSize()*getSize();
    }

    @Override
    public String toString() {
        return "Square " + getSize()+" area = " + calcArea();
    }
}
