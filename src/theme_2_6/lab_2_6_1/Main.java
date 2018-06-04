package theme_2_6.lab_2_6_1;
import theme_2_6.lab_2_6_1.apple.Apple;
import theme_2_6.lab_2_6_1.car.Car;
public class Main {
    public static void main(String[] args) {
        Apple a = new Apple();
        Car c = new Car();
        a.setWeight(345.24);
        System.out.println(a.getWeight());
        c.setWeight(6735.24);
        System.out.println(c.getWeight());
    }
}
