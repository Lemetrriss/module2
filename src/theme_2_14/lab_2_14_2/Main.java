package theme_2_14.lab_2_14_2;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5,6,7,8,9,0,};
        String[] arr2 = {"One", "Two", "Three", "Four", "Five", "Thix", "Seven", "Eight", "Nine", "Then",};
        MyMixet<Integer> mm1 = new MyMixet<>(arr1);
        MyMixet<String> mm2 = new MyMixet<>(arr2);
        Integer[] arrRes1 = mm1.shuffle(mm1.getMas());
        System.out.println(java.util.Arrays.toString(arrRes1));
        String[] arrRes2 = mm2.shuffle(mm2.getMas());
        System.out.println(java.util.Arrays.toString(arrRes2));
    }
}
