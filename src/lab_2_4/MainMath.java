package lab_2_4;

import lab_2_4.task.Calculation;
import lab_2_4.task.Employee;
import lab_2_4.task.MyMath;

public class MainMath {
    public static void main(String[] args) {
        Calculation.calc();
        System.out.println("MyMath.areaOfCircle(10) = " + MyMath.areaOfCircle(10));

        Employee e1 = new Employee("Ivan", "Ivanov", "engineer", "123");
        Employee e2 = new Employee("Ivan", "Ivanov", "engineer", "123");
        Employee e3 = new Employee("Ivan", "Ivanov", "engineer", "123");
        Employee e4 = new Employee();
        System.out.println(Employee.getNumberOfEmployeess());
    }
}
