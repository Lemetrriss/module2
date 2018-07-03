package theme_2_12.lab_2_12_3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        MyPhone.MyPhoneBook.PhoneNumber s = new MyPhone().new MyPhoneBook().new PhoneNumber("", "");
        Random r = new Random();
        MyPhone myPhone = new MyPhone();
        myPhone.swithOn();
        myPhone.call(r.nextInt(10));
    }
}
