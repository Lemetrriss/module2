package theme_2_10.lab_2_10_2;

public class Wrapped2 {
    public static void main(String[] args) {
        System.out.println(compute(10, 100L));
    }
    private static double compute(Integer i, Long l){
        Double d1 = i.doubleValue();
        Double d2 = l.doubleValue();
        return d1 + d2;
    }
}
