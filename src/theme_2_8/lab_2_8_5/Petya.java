package theme_2_8.lab_2_8_5;

public class Petya extends Student{

    public Petya(String name, int mark, double avarYearMark){
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
