package theme_2_15.lab_2_15_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add("Number_"+i);
        }
//Iterator<String> iterator = list.iterator(); iterator.hasNext();
        for (int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        //iterator.next()
    }
}
