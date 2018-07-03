package theme_2_12.lab_2_12_5;

class Nested {

    Inner inner = new Inner();
    Nested.StaticNested staticNested = new Nested.StaticNested();

    void test(){
        class Local{
            void print(){
                System.out.println(this);
            }

            @Override
            public String toString() {
                return getClass().getSimpleName();
            }
        }
        Local local = new Local();
        local.print();
    }

    static class StaticNested{

        void callFromStaticNested(){
            new Nested().test();
        }

        @Override
        public String toString() {
            return "StaticNested{}";
        }
    }

    class Inner{

        void callFromInner(){
            test();
        }

        @Override
        public String toString() {
            return "Inner{}";
        }
    }
}
