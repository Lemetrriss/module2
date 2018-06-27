package classWork.theme_2_15;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int mark;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return mark == student.mark &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, mark);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Student(String name, int mark) {

        this.name = name;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student o) {
        int r = this.name.compareTo(o.name);
        if(r != 0)
            return r;
        return Integer.compare(this.mark, o.mark);
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
