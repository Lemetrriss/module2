package theme_2_5.lab_2_5_5;

public class InitTest {
    private int id;
    private static int nextId;
    static {
        nextId = (int)(1000*Math.random());
        System.out.println("nextId = " + nextId);
    }

    public InitTest() {
        id = ++nextId;
    }

    public int getId() {
        return id;
    }
}
