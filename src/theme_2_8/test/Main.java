package theme_2_8.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Test[] t = m.method();
        m.print(t);
        Arrays.sort(t);
        System.out.println("---------------------");
        m.print(t);
    }

    private Test[] method(){
        Random r =new Random();
        Test[] tests = new Test[10];
        for (int i = 0; i < tests.length; i++) {
            tests[i] = new Test(r.nextInt(20));
        }
        return tests;
    }

    private void print(Test[] t){
        for (Test o : t) {
            System.out.println(o);
        }
    }
}
