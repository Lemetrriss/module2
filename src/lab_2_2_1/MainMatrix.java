package lab_2_2_1;

import java.util.Random;
import java.util.Scanner;

public class MainMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        printM(Matrix.add(createM(x),createM(x)));
        printM(Matrix.multiply(createM(x), createM(x)));
    }

    private static int[][] createM (final int x){
        Random r = new Random();
        int[][] m = new int[x][x];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = r.nextInt(10);
            }
        }
        return m;
    }
    private static void printM (int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%4d", anInt);
            }
            System.out.println();
        }
        System.out.println();
    }
}
