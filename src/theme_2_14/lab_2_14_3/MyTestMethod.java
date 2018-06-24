package theme_2_14.lab_2_14_3;

class MyTestMethod{

    static <T extends Number> int calcNum(T[] arr, T maxElem){
        int x=0;
        for (T anArr : arr) {
            if (anArr.doubleValue() > maxElem.doubleValue())
                x++;
        }
        return x;
    }
}
