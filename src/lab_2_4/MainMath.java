package lab_2_4;

import lab_2_4.task.Calculation;
import lab_2_4.task.MyMath;

public class MainMath {
    public static void main(String[] args) {
        Calculation.calc();
        System.out.println("MyMath.areaOfCircle(10) = " + MyMath.areaOfCircle(10));
    }
}

