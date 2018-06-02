package theme_2_5.lab_2_5_5;

public class Main {
    public static void main(String[] args) {
        InitTest[] arr = new InitTest[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new InitTest();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getId());
        }
    }
}
