package theme_2_5.lab_2_5_2;

import java.util.Arrays;
import java.util.Random;

public class MyInit {

    private Random r = new Random();

    int[] arr = new int[10];

    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
    }

    static void printArray(int[] a){
        System.out.println(Arrays.toString(a));
    }
}
