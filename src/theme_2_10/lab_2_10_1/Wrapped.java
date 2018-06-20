package theme_2_10.lab_2_10_1;

public class Wrapped {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = new Integer(127);
        Integer i3 = Integer.valueOf(127);
        Integer i4 = Integer.parseInt("127");
        System.out.println(i1 == i3);
        System.out.println(i1 == i4);
        System.out.println(i3 == i4);
        System.out.println(i1 == i2);
        System.out.println(i3 == i2);
        System.out.println(i4 == i2);
        System.out.println("------------------------------------");
        Integer j1 = 129;
        Integer j2 = new Integer(129);
        Integer j3 = Integer.valueOf(129);
        Integer j4 = Integer.parseInt("129");
        System.out.println(j1 == j3);
        System.out.println(j1 == j4);
        System.out.println(j3 == j4);
        System.out.println(j1 == j2);
        System.out.println(j3 == j2);
        System.out.println(j4 == j2);

    }
}
