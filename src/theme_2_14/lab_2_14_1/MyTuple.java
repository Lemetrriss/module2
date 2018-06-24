package theme_2_14.lab_2_14_1;

class MyTuple<A,B,C> {
    private A a;
    private B b;
    private C c;

    MyTuple(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    A getA() {
        return a;
    }

    B getB() {
        return b;
    }

    C getC() {
        return c;
    }
}
