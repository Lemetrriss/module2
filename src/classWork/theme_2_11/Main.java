package classWork.theme_2_11;

public class Main {

    public static void main(String[] args) {
        try {
            throw new Exception("qwerty");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("we were there");
        }

        MyTest test = null;
        try {
            test.test();
        } catch (MyException e) {
            e.printMessage();
        }
    }
}
