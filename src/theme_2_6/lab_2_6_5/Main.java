package theme_2_6.lab_2_6_5;
import theme_2_5.lab_2_5_5.InitTest;

public class Main {
    public static void main(String[] args) {
        theme_2_6.lab_2_6_5.calc.Calc a = new  theme_2_6.lab_2_6_5.calc.Calc(23.2,33.5, 43.5);
        System.out.println("a = " + a);
        System.out.println(a.getArea());
        InitTest i = new InitTest();
        i.getId();
        System.out.println(i.getClass());
    }
}