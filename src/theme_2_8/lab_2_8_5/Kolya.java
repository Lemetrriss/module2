package theme_2_8.lab_2_8_5;

public class Kolya extends Student{

    public Kolya(String name, int mark, double avarYearMark) {
        super(name, mark, avarYearMark);
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                ", avarYearMark=" + avarYearMark +
                '}';
    }
}
