package classWork.theme_2_12;

interface MyTest{
    void test();
}

public class Main {
    MyTest tst = new MyTest() {
        @Override
        public void test() {
            System.out.println("Hello");
        }
    };


    public static void main(String[] args) {
        MyDirection dir = MyDirection.valueOf("NORTH");
        System.out.println(dir.name() + " " + dir.valueOf("NORTH")+" "+dir.ordinal());
    }
}
