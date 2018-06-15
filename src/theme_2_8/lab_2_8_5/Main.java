package theme_2_8.lab_2_8_5;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> studentTreeSet = new TreeSet<Student>(Comparator.comparing(Student::getAvarYearMark).thenComparing(Student::getMark).thenComparing(Student::getName));
        studentTreeSet.add(new Vasya("Vasya", 12, 100.0));
        studentTreeSet.add(new Petya("Petya", 10, 80.0));
        studentTreeSet.add(new Kolya("Kolya", 7, 50.0));
        studentTreeSet.add(new Kolya("Sasha", 4, 30.0));
        studentTreeSet.add(new Kolya("Dima", 9, 70.0));
        studentTreeSet.add(new Kolya("Igor", 11, 90.0));
        studentTreeSet.add(new Kolya("Slava", 3, 25.0));
        studentTreeSet.add(new Kolya("Sergey", 8, 50.0));
        studentTreeSet.add(new Kolya("Zhenya", 11, 100.0));
        studentTreeSet.add(new Kolya("Andrey", 9, 80.0));
        studentTreeSet.add(new Kolya("Oleg", 4, 25.0));
        studentTreeSet.add(new Kolya("Maksim", 8, 60.0));
        studentTreeSet.add(new Kolya("Anton", 5, 40.0));
        studentTreeSet.add(new Kolya("Lev", 11, 90.0));
        studentTreeSet.add(new Kolya("Vova", 10, 80.0));
        studentTreeSet.add(new Kolya("Boris", 6, 50.0));
        studentTreeSet.add(new Kolya("Kolya", 2, 20.0));

        for (Student student : studentTreeSet) {
            student.draw();
        }
    }
}
