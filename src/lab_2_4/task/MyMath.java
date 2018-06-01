package lab_2_4.task;

public class MyMath {

    final static double PI = Math.PI;
    public static double areaOfCircle(double radius){
        return PI*radius*radius;
    }

    public static int findMin(int[] a){
        int res = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]<res){
                res = a[i];
            }
        }
        return res;
    }
    public static int findMax(int[] a){
        int res = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]>res){
                res = a[i];
            }
        }
        return res;
    }
}
