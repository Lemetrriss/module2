package theme_2_12.lab_2_12_5;

public class Main {
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.test();
        System.out.println(nested.inner);
        nested.inner.callFromInner();
        System.out.println(nested.staticNested);
        nested.staticNested.callFromStaticNested();
    }
}
