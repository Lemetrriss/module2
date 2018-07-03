package theme_2_12.lab_2_12_1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:\\Users\\Пользователь\\Dropbox\\academyMain\\module2\\src\\theme_2_12\\lab_2_12_1\\book.txt"));
            while (sc.hasNext()) {
                if (myPhoneBook.addPhoneNumber(sc.next(), sc.next())) {
                    myPhoneBook.printPhoneNumber();
                }
                System.out.println("------------------------");
            }
            myPhoneBook.printPhoneNumber(myPhoneBook.getPhoneNumbers());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();
        myPhoneBook.sortByName();
        myPhoneBook.printPhoneNumber(myPhoneBook.getPhoneNumbers());
        System.out.println();
        myPhoneBook.sortByPhoneNumber();
        myPhoneBook.printPhoneNumber(myPhoneBook.getPhoneNumbers());
    }
}
