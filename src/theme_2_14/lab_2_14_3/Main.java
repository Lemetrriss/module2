package theme_2_14.lab_2_14_3;


public class Main {
    public static void main(String[] args) {
        System.out.println("Number of elements, greater then 45 in arr is: "+MyTestMethod.calcNum(new Double[]{24.4, 64.6, 3.2, 46.24, 78.64, 9.3, 12.0, 0.999, 32.4, }, 45.0));
        System.out.println("Number of elements, greater then 3 in ar is: "+MyTestMethod.calcNum(new Integer[]{3,1,4,6,9,6,2,1,6,9,68,4,4,13,3}, 3));
    }
}
