import static java.lang.Math.sin;

public class Test {
    private int x = 10;
    private int f = 100;
    private void doJob(int y){
        int z = 20;
        class Inner{
            private int x = 50;
            private void test(){
                System.out.println(x);
                System.out.println(Test.this.x);
                System.out.println(f);
                System.out.println(y);
                System.out.println(z);
                System.out.println(sin(f));
            }
        }
        new Inner().test();
    }

    public static void main(String[] args) {
        new Test().doJob(9);
    }
}
