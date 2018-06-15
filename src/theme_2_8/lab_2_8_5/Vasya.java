package theme_2_8.lab_2_8_5;

public class Vasya extends Student {

    public Vasya(String name, int mark, double avarYearMark) {
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
