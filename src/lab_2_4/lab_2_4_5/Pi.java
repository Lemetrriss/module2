package lab_2_4.lab_2_4_5;

public class Pi {

    public static void main(String[] args) {
        System.out.println(valuePi(1000000));
    }

    private static double valuePi(int n) {
        double z = -1;
        double calc = 4;
        for (double i = 1; i < n; i++) {
            calc += (4/(i*2+1))*z;
            z = -z;
            System.out.println(calc);
        }
        return calc;
    }
}