package classWork;

public class Employee {
    public void calcSalary(String name, double... salary){
        System.out.print(name+" - ");
        double summ = 0;
        for (double v : salary) {
            summ+=v;
        }
        System.out.println(summ+" hrn");
    }
}