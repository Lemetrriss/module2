package lab_2_3_1;

public class MyWindow {
    double width;
    double height;
    int numberOfGlass;
    String color;
    boolean isOpen;

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public static void main(String[] args) {
        MyWindow mw = new MyWindow(12.31, 45.67, 2, "white", true);
        System.out.println(mw);
        MyWindow mw1 = new MyWindow();
        System.out.println(mw1);
    }

    public MyWindow() {
        width = 55.5;
        height = 44.53;
        numberOfGlass = 3;
        color = "Red";
        isOpen = false;
    }

    @Override
    public String toString() {
        return "MyWindow{" +
                "width = " + width +
                ", height = " + height +
                ", numberOfGlass = " + numberOfGlass +
                ", color = '" + color + '\'' +
                ", isOpen = " + isOpen +
                '}';

    }
}
