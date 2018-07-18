package classWork.BerkutLab.ex7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        zad7();
//        zad10();
        zad12();
//        zad13();
//        zad15();
    }

    private static void zad15() {
        HashMap<String, Integer> map = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("text.txt"))){
            String line;
            while ((line = reader.readLine())!=null) {
                String[] split = line.toLowerCase().split("\\W+");
                for (String s : split) {
                    Integer v = map.getOrDefault(s, 0);
                    map.put(s, v + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

    private static void zad13() {
        List<Integer> list = new ArrayList<>(Arrays.asList(4, 5, -6, 2, -7, -4, 11, -9, 10, 0));
        int i = 0;
        int j = list.size()-1;
        while (i<j) {
            while (i < list.size() && list.get(i) > 0) i++;
            while (j >= 0 && list.get(j) < 0) j--;
            if (i<j) {
                Collections.swap(list, i, j);
            }
        }
        System.out.println(list);
    }

    private static void zad12() {
        List<Double> polynom1 = Arrays.asList(4., 2., 1., 0., 7.);
        List<Double> polynom2 = Arrays.asList(2., 3., 5.);
        List<Double> result = multiply(polynom1,polynom2);
        System.out.println(result);

    }

    private static List<Double> multiply(List<Double> polynom1, List<Double> polynom2) {

        int size = polynom1.size() + polynom2.size() - 1;
        Double[] a = new Double[size];
        Arrays.fill(a, 0.0);
        List<Double> result = new ArrayList<>(Arrays.asList(a));
        for (int s = 0; s < result.size(); s++) {
            for (int i = 0; i < polynom1.size(); i++) {
                int j = s - i;
                if (j>=0 && j<polynom2.size()) {
                    result.set(s, result.get(s) + polynom1.get(i)*polynom2.get(j));
                }
            }
        }

        return result;
    }

    private static void zad10() {
        Random rnd = new Random(47);
        List<Double> list1 = rnd.doubles(100_000).mapToObj(x -> x).collect(Collectors.toList());
        double sum = 0;
        for (Double x : list1) {
            sum += x;
        }
        System.out.println(sum);

        Random rnd1 = new Random(47);
        double sum1 = rnd1.doubles(100_000).sum();
        System.out.println(sum1);

        Random rnd2 = new Random(47);
        List<Double> list2 = rnd2.doubles(100_000).mapToObj(x -> x).collect(Collectors.toList());
        while (list2.size()>1) {
            for (int i = 0; i < list2.size(); i+=2) {
                if (i + 1 < list2.size()) {
                    list2.set(i, list2.get(i) + list2.get(i + 1));
                }
            }
            boolean delete = false;
            for (Iterator<Double> iterator = list2.iterator(); iterator.hasNext(); ) {
                iterator.next();
                if (delete) iterator.remove();
                delete = !delete;
            }
        }
        System.out.println(list2.get(0));
    }

    private static void zad7() {
        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();

        stack1.addAll(Arrays.asList(1,2,3,4,5,6));
        stack2.addAll(Arrays.asList(7,8,9,10));

        System.out.println(stack1);
        System.out.println(stack2);

        Deque<Integer> tmp1 = new ArrayDeque<>();
        while (!stack1.isEmpty()) {
            tmp1.push(stack1.pop());
        }

//        Deque<Integer> tmp2 = new ArrayDeque<>();
        int count = stack2.size();
        while (!stack2.isEmpty()) {
            tmp1.push(stack2.pop());
        }

        while (count-->0) {
            stack1.push(tmp1.pop());
        }
        while (!tmp1.isEmpty()) {
            stack2.push(tmp1.pop());
        }

        System.out.println(stack1);
        System.out.println(stack2);
    }
}