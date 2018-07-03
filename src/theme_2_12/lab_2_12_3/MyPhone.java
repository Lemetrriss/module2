package theme_2_12.lab_2_12_3;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class MyPhone {
    private MyPhone.MyPhoneBook myPhoneBook = new MyPhone().new MyPhoneBook();

    MyPhone() {
    }

    void call(int i){
        System.out.println("Calling to ");
        System.out.println(myPhoneBook.getPhoneNumbers()[i]);
    }

    void swithOn() {
        System.out.println("Loading phone book records...");

        Scanner sc;
        try {
            sc = new Scanner(new File("C:\\Users\\Пользователь\\Dropbox\\academyMain\\module2\\src\\theme_2_12\\lab_2_12_1\\book.txt"));
            while (sc.hasNext()) {
                myPhoneBook.addPhoneNumber(sc.next(), sc.next());
            }
        } catch (Exception e){
            e.getMessage();
        }
        System.out.println("Ok!");
    }

    class MyPhoneBook {

        private int count;
        private PhoneNumber[] phoneNumbers = new PhoneNumber[10];
        MyPhoneBook my = new MyPhoneBook();

        public void sortByName(){
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
        }

        public void sortByPhoneNumber(){
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {
                    return o1.getPhone().compareTo(o2.getPhone());
                }
            });
        }

        PhoneNumber[] getPhoneNumbers() {
            return phoneNumbers;
        }

        void addPhoneNumber(String name, String phone){
            if(count<phoneNumbers.length) {
                phoneNumbers[count++] = my.new PhoneNumber(name, phone);
            }
        }

        void printPhoneNumber(){
            System.out.println(phoneNumbers[count-1]);
        }

        void printPhoneNumber(PhoneNumber[] arr){
            for (PhoneNumber phoneNumber : arr) {
                System.out.println(phoneNumber);
            }
        }

        class PhoneNumber {

            String name, phone;

            public String getName() {
                return name;
            }

            String getPhone() {
                return phone;
            }

            PhoneNumber(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            @Override
            public String toString() {
                return "PhoneNumber{" +
                        "name='" + name + '\'' +
                        ", phone='" + phone + '\'' +
                        '}';
            }
        }
    }
}
