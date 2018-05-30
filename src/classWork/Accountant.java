package classWork;

import java.util.Random;
import java.util.Scanner;

public class Accountant {

    private static Scanner sc = new Scanner(System.in);
    private static Employee[] employees = new Employee[sc.nextInt()];

    public static void main(String[] args) {
        Random r = new Random();
        Object[][] table = new Object[employees.length][7];

        for (int i = 0; i < table.length; i++) {

            table[i][0] = sc.nextLine();  // почему-то пропускает первую итерацию и спрашивает ввод имени только со второго работника?

            for (int j = 1; j < table[i].length; j++) {
                table[i][j] = 10000*r.nextDouble();
            }
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
}