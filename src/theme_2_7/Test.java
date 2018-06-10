package theme_2_7;

abstract class Test {
    int maxSpeed = 160;
//    abstract void test();
}

class Test2 extends Test{
    int maxSpeed = 280;
    void test(){
        System.out.println(maxSpeed);
        System.out.println(super.maxSpeed);
    }
}

class Main{
    public static void main(String[] args) {
        Test t = new Test2();
        ((Test2)t).test();
    }
}