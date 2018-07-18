import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(new Iterabler() {
                        {
                            System.out.println("New Thread");
                        }

                        @Override
                        public List myFunc(int i) {
                            List<Integer> list = new ArrayList<>();
                            for (int j = i; j < i + 100; j++) {
                                list.add(j);
                            }
                            return list;
                        }
                    }.myFunc(0));
                }
            }).start();
        }
    }
}
