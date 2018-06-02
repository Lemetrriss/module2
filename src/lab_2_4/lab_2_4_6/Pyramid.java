package lab_2_4.lab_2_4_6;

public class Pyramid {
    public static void main(String[] args) {
        printPyramid(10);
    }

    private static void printPyramid(int h) {
        String s = "";
        int j;
        for (int i = 1; i <= h; i++) {
            if(h-i != 0) System.out.printf("%"+(h-i)+"s",s);
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (j = i-1; j>=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
