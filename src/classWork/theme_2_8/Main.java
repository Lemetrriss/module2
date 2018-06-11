package classWork.theme_2_8;

import java.util.Arrays;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        MyClass c = new MyClass();
        System.out.println(((MyInterface1)c).ANSWER);


        Shape[] shapes = {new Circle(3.5), new Square(7), new Circle(3), new Square(3), new Square(6),};
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].calcArea());
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
        Arrays.sort(shapes, Comparator.comparingDouble(Shape::getSize));
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}