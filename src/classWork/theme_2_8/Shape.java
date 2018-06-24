package classWork.theme_2_8;

import java.sql.Struct;

public abstract class Shape implements Drawable, Comparable<Shape>{
    private double size;
    private String name;

    public Shape(double size, String name) {
        this.size = size;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public abstract double calcArea();

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public int compareTo(Shape o) {

//        return Double.compare(calcArea(), o.calcArea());

        return (int)(this.calcArea() - o.calcArea());
//        if(calcArea() < o.calcArea()) return -1;
//        if(calcArea() > o.calcArea()) return 1;
//        return 0;
    }
    public static Shape parseShape(String s) throws InvalidShapeStringException {
        String[] split = s.split(":");
        if(split.length < 3) throw new InvalidShapeStringException(s);
        switch (split[0]){
            case "Circle" : return Circle.parseShape(s);
            case "Square" : return Square.parseShape(s);
            default: throw new InvalidShapeStringException(s);
        }
    }
}
