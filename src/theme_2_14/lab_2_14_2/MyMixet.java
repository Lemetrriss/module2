package theme_2_14.lab_2_14_2;

import java.util.Random;

class MyMixet<T> {
    private T mas[];

    MyMixet(T mas[]) {
        this.mas = mas;
    }

    T[] getMas() {
        return mas;
    }

    T[] shuffle(T arr[]){
        Random r = new Random();
        for (int i = arr.length-1; i > 0 ; i--) {
            int index = r.nextInt(i+1);
            T a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
        return arr;
    }
}