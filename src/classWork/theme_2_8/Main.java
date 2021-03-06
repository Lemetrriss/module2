package classWork.theme_2_8;

import java.util.Arrays;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        MyClass c = new MyClass();
        System.out.println(((MyInterface1)c).ANSWER);


        Shape[] shapes = {new Circle(3.5, "Dima"), new Square(7, "Oleg"), new Circle(3, "Igor"), new Square(3, "Vasya"), new Square(6, "Dima"),};
        for (Shape shape1 : shapes) {
            System.out.println(shape1.calcArea());
        }

        System.out.println("-----------------------");

        for (Shape shape : shapes) {
            shape.draw();
        }

        System.out.println(shapes[1].compareTo(shapes[2]));

        Arrays.sort(shapes);

        for (Shape shape : shapes) {
            shape.draw();
        }
        System.out.println("----------------------");
//        Arrays.sort(shapes, new SizeComparator());
        Arrays.sort(shapes, Comparator.comparing(Shape::getName).thenComparing(Shape::getSize));
        for (Shape shape : shapes) {
            shape.draw();
        }
        try {
            Shape shape = Shape.parseShape("Circle:RED:10,20");
        } catch (InvalidShapeStringException e) {
            e.printStackTrace();
        }
    }
}