package theme_2_14.lab_2_14_1;

public class Main {
    public static void main(String[] args) {
        MyTuple<String, Integer, Long> my1 = new MyTuple<>("Hello", 10, 1111L);
        MyTuple<Double, String, String> my2 = new MyTuple<>(25.5, "world", "!");
        System.out.println(my1.getA().concat(", ").concat(my2.getB()).concat(my2.getC()));
    }
}