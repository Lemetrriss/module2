package theme_2_5.lab_2_5_1;

public class MyInitTest {
    public MyInitTest() {
        this(1);
        System.out.println("Constructor 1");
    }

    public MyInitTest(int i) {
        System.out.println("Constructor 2");
    }

    {
        System.out.println("Non-Static Init Block 1");
    }
    {
        System.out.println("Non-Static Init Block 2");
    }
    static {
        System.out.println("Static Init Block 1");
    }
    static {
        System.out.println("Static Init Block 2");
    }
}
