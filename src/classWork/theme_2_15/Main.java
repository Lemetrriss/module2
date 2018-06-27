package classWork.theme_2_15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("aaa");
        col.add("bbb");
        col.add("ccc");
//        col.addAll(List.of("ddd", "eee", "fff")); // работает только в 10 джаве.
        List<String> list = Arrays.asList("ddd", "eee", "fff");
        col.addAll(list);
//        col.remove("ccc");
        System.out.println(col);
        String[] arr = new String[0];
        String[] arr1 = col.toArray(arr);
        System.out.println(arr == arr1);
        for (String s : arr1) {
            System.out.println(s);
        }
        System.out.println("---------------------------------");
//        Collection<Integer> ints = new ArrayList<>();
//        ints.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
//        for (Iterator<Integer> iterator = ints.iterator(); ((Iterator) iterator).hasNext();){
//            Integer next = iterator.next();
//            if(next % 2 == 0){
//                iterator.remove();
//            }
//            System.out.println(ints);
//        }
        List<Integer> ints = new ArrayList<>();
        ints.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        List sub = ints.subList(3,7);
        System.out.println(sub);
        sub.set(0,54);
        System.out.println(sub);
        System.out.println(ints);
        sub.remove(3);
        System.out.println(sub);
        System.out.println(ints);
    }
}