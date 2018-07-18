package theme_2_15.lab_2_15_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        List<String> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int j = r.nextInt(list.size()+1);
            list.add(j, "Number "+i);
            System.out.println(j);
        }
        System.out.println(list);
    }
}
