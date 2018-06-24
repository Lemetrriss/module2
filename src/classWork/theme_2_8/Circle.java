package classWork.theme_2_8;

public class Circle extends Shape {

    public Circle(double radius, String name) {
        super(radius, name);
    }

    @Override
    public double calcArea() {
        return Math.PI*getSize()*getSize();
    }

    @Override
    public String toString() {
        return "Circle" + getSize() + ", name - " + getName() + ", area = " + calcArea();
    }

    public static Circle parseShape(String s) throws InvalidShapeStringException {
        String[] split = s.split(":");
        String color = split[1];
        String[] xy = split[2].split(",");
        try {
            double width = Double.parseDouble(xy[0]);
            double height = Double.parseDouble(xy[1]);
//            return Circle(color, width, height); // Constructor u menya drugoi, tut dlya Rectangle
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            throw new InvalidShapeStringException("size is not defined");
        }
        return null;
    }
}
