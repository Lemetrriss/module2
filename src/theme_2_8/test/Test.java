package theme_2_8.test;

public class Test implements Comparable<Test>{
    int number;

    public Test(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Test t) {
        return Integer.compare(this.number, t.number);
    }

    @Override
    public String toString() {
        return "Test{" +
                "number=" + number +
                '}';
    }
}
