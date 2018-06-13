package theme_2_2.lab_2_2_3;

class Employee {
    private String name;

    Employee(String name) {
        this.name = name;
    }

    void calcSalary(double... salary){
        System.out.print(name+" - ");
        double summ = 0;
        for (double v : salary) {
            summ+=v;
        }
        System.out.println(String.format("%.2f",summ)+" hrn");
    }
}