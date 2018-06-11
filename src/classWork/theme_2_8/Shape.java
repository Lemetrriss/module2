package classWork.theme_2_8;

public abstract class Shape implements Drawable, Comparable<Shape>{
    private double size;

    public Shape(double size) {
        this.size = size;
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

        return Double.compare(calcArea(), o.calcArea());

//        if(calcArea() < o.calcArea()) return -1;
//        if(calcArea() > o.calcArea()) return 1;
//        return 0;
    }
}
