package classWork.theme_2_9;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().get());
    }
    String get(){
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Main{}";
    }
}