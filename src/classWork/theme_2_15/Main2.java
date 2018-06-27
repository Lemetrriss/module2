package classWork.theme_2_15;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {
//     workWithSets();
//     workWithMaps();
//     example();
     example2();   // removing by mark
    }

    private static void example2() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", 2));
        students.add(new Student("Ivan", 1));
        students.add(new Student("Zeta", 5));
        students.add(new Student("Alex", 1));
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("-----------------------");
//        for (int i = 0; i < students.size(); i++){    // неправильно!
//            if(students.get(i).getMark()<3){
//                students.remove(i);
//            }
//        }

        for (Iterator<Student> iterator = students.iterator(); iterator.hasNext();){
            Student student = iterator.next();
            if(student.getMark() < 3){
                iterator.remove();
            }
        }
        System.out.println(students);
    }

    private static void example() {
        String s = " that the ordering maintained by a tree map, like any sorted map, " +
                "and whether or not an explicit comparator is provided, must be consistent " +
                "with equals if this sorted map is to correctly implement the Map interface.";

        Map<Character, Integer> map = new TreeMap<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (Character.isLetter(aChar)) {
                int count = map.getOrDefault(aChar, 0);
                map.put(aChar, count + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void workWithMaps(){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        map.put("Six", 6);
        map.put("Seven", 7);
        map.put(null,null);  // Так не делать!!
        map.put("null",null);  //  Так не делать!!
        System.out.println(map.getOrDefault(4, 876));
        System.out.println(map);

    }

    private static void workWithSets() {
        Set<Integer> set = new HashSet<>(Arrays.asList(1,4,2,7,3,5,6,17,16,18));
        System.out.println(set);

        Set<Student> students = new TreeSet<>(Comparator.comparingInt(Student::getMark)
                .reversed().thenComparing(Student::getName));
        students.add(new Student("Ivan", 2));
        students.add(new Student("Ivan", 1));
        students.add(new Student("Zeta", 5));
        students.add(new Student("Alex", 1));
        System.out.println(students);
    }
}