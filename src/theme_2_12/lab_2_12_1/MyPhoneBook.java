package theme_2_12.lab_2_12_1;

import java.util.Arrays;
import java.util.Comparator;


class MyPhoneBook {

    private int count;
    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

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

    boolean addPhoneNumber(String name, String phone){
        if(count<phoneNumbers.length) {
            phoneNumbers[count++] = new MyPhoneBook.PhoneNumber(name, phone);
            return true;
        }
        return false;
    }

    void printPhoneNumber(){
            System.out.println(phoneNumbers[count-1]);

    }    void printPhoneNumber(PhoneNumber[] arr){
        for (PhoneNumber phoneNumber : arr) {
        System.out.println(phoneNumber);
        }
    }

    static class PhoneNumber {

        String name, phone;

        public String getName() {
            return name;
        }

        public String getPhone() {
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
