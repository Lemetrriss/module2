package lab_2_2_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Accountant {

    private Scanner sc = new Scanner(System.in);
    private Random r = new Random();

    private Employee[] employees = new Employee[sc.nextInt()];

    private Object[][] table = new Object[employees.length][13];

    private void proceed() {

        for (int i = 0; i < table.length; i++) {

            table[i][0] = sc.nextLine();  // почему-то пропускает первую итерацию и спрашивает ввод имени только со второго работника?

            for (int j = 1; j < table[i].length; j++) {
                table[i][j] = 10000*r.nextDouble();
            }
            System.out.println(Arrays.toString(table[i]));
        }

        for (int i = 0; i < table.length; i++) {

            employees[i] = new Employee((String)table[i][0]);

            double[] salary = new double[table[i].length-1];

            for (int j = 1; j < table[i].length; j++) {
                salary[j-1] = (double)table[i][j];
            }
            employees[i].calcSalary(salary);
        }
    }

    public static void main(String[] args) {
        new Accountant().proceed();
    }
}