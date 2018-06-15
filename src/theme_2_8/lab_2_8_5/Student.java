package theme_2_8.lab_2_8_5;

abstract class Student implements Drawable, Comparable<Student>{
    String name;
    int mark;
    double avarYearMark;

    public Student(String name, int mark, double avarYearMark) {
        this.name = name;
        this.mark = mark;
        this.avarYearMark = avarYearMark;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public double getAvarYearMark() {
        return avarYearMark;
    }

    @Override
    public void draw(){
        System.out.println(this);
    }

    @Override
    public int compareTo(Student o) {
        return getName().compareTo(o.getName());
    }
}
