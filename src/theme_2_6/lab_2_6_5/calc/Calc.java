package theme_2_6.lab_2_6_5.calc;
import static java.lang.Math.*;

public class Calc {

    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;

    public Calc(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double s = (a+b+c)/2;
        return sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return "Apple{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
