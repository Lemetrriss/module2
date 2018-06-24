package theme_2_9.lab_2_9_1;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Formatter;

public class StringMain {
    public static void main(String[] args) {
        String a = "abc", b = "def", c = "ghj";
        System.out.println(a.concat(b).concat(c));
        char[] ch = {'d', 'r', '2', 's', '!'};
        String d = String.copyValueOf(ch);
        System.out.println(d);
        byte[] bt = new byte[0];
        try {
            bt = a.getBytes("Hallo");
        } catch (UnsupportedEncodingException e) {
            System.out.println(e);
//            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
        System.out.println(bt);
        System.out.println(Arrays.toString(bt));
        String str1 = new String("Abra Cadabra");
        String str2 = new String("Abra Cadabra");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode() == str2.hashCode());
        System.out.println("Abra Cadabra" == str2.intern());
        System.out.println(Arrays.toString(str1.split(" ")));
        System.out.println(str1.subSequence(5, 10));
        System.out.println(str1.toCharArray().length);
        String str3 = String.valueOf('s');
        System.out.println(str3);
        Float f = Float.parseFloat("253.3");

        Formatter fr = new Formatter(System.err);
        fr.format("kjshbgskfn");
    }
}