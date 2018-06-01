package lab_2_4.task;

public class Calculation {
    public static void calc(){
        int[] a = {1,3,7,4,-6,4,-2,5,-1,};
        int[] b = {3,-3,-7,1,6,-4,-9,1,8,};
        int minA = MyMath.findMin(a);
        int minB = MyMath.findMin(b);
        int maxA = MyMath.findMax(a);
        int maxB = MyMath.findMax(b);
        System.out.println("minA = "+minA);
        System.out.println("minB = "+minB);
        System.out.println("maxA = "+maxA);
        System.out.println("maxB = "+maxB);
    }
}
