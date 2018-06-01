package lab_2_3_1;

public class MyWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public MyWindow(double width, double height) {
            this(width, height, 3, "Black", true);
            this.width = width;
            this.height = height;
    }

    public MyWindow(int numberOfGlass, String color, boolean isOpen) {
        this(345.53, 98.8746, numberOfGlass, color, isOpen);
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public MyWindow() {
        width = 55.5;
        height = 44.53;
        numberOfGlass = 3;
        color = "Red";
        isOpen = false;
    }

    public static void main(String[] args) {
        MyWindow mw = new MyWindow(12.31, 45.67, 2, "white", true);
//        System.out.println(mw);
        mw.printFields();
        MyWindow mw1 = new MyWindow();
//        System.out.println(mw1);
        mw1.printFields();
        System.out.println();
        MyWindow[] arr = new MyWindow[3];
        arr[0] = new MyWindow();
        arr[1] = new MyWindow(87.866, 98.7644);
        arr[2] = new MyWindow(7, "Blue", false);
        for (int i = 0; i < arr.length; i++) {
            arr[i].printFields();
        }

    }

    public void printFields(){
        System.out.println(this);
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