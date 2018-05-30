package classWork;

public class Maincomp {
    public static void main(String[] args) {
        Comp[] arr = new Comp[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Comp(i);
        }
        for (int i=0; i<arr.length; i++){
            arr[i].setPrice((i+1)*100);
        }
        for (Comp comp : arr) {
            double v = comp.getPrice()*1.1;
            comp.setPrice(v);
        }

        for (Comp comp : arr) {
            System.out.println(comp);
        }
    }
}