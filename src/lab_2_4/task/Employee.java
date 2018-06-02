package lab_2_4.task;

public class Employee {
    private String firstName;
    private String lasttName;
    private String occupation;
    private String phone;

    private static int numberOfEmployeess;

    public Employee(String firstName, String lasttName, String occupation, String phone) {
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.occupation = occupation;
        this.phone = phone;
        numberOfEmployeess++;
    }

    public Employee() {

        this("noname", "-","-","-");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static int getNumberOfEmployeess() {
        return numberOfEmployeess;
    }
}
