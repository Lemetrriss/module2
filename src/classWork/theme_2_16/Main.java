package classWork.theme_2_16;

public class Main {
    static String s;
    static void var(Integer i){
        System.out.println("Integer");
    }
    static void var(int i){
        System.out.println("int");
    }

    static void var(short i){
        System.out.println("short");
    }

    public static <T> void var(T... i){
        for (T t : i) {
            System.out.print(t+", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        var(1, 5, Integer.valueOf(76), 54.76, "hgghcc");
        System.out.println(s);
    }


}
