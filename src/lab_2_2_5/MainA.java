package lab_2_2_5;

import java.util.Scanner;

class MainA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        System.out.println(new A().calcSquare(radius));

    }
}
