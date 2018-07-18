package classWork.theme_2_18;

import sun.util.resources.LocaleData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BigDecimalTest();
        randoms();
        propertieses();
        dates();

        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.freeMemory());
        int[] a = new int[20_000_000];
//        int[] b = new int[20_000_000];
//        int[] c = new int[20_000_000];
//        int[] d = new int[20_000_000];
        System.out.println(runtime.freeMemory());
        try {
            Process process = runtime.exec("\"C:\\Program Files (x86)\\Microsoft\\Skype for Desktop\\Skype.exe\"");
            Thread.sleep(5000);
//            process.destroy();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void dates() {
        Locale locale = new Locale("fr", "FR");
        Locale.setDefault(locale);
        LocalDate now = LocalDate.now();
        System.out.println(now.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
        System.out.printf("%f\n", 1_000_000.5);

        Date date = new Date();
        long time = date.getTime();
        System.out.println(date);
        System.out.println(time);
        Date tomorrow = new Date(118, 6, 12);
        System.out.println(tomorrow);
        Date q = new Date(date.getTime()-14*24*60*60*1000);
        System.out.println(q);
        Date q1 = new Date(30L*24*60*60*1000 + q.getTime());
        System.out.println(q1);

        LocalDate date1 = now.minusMonths(1).minusDays(5);
        System.out.println(date1);
    }

    private static void propertieses() {
        Properties properties = new Properties();
        try {
            properties.load(new BufferedReader(new FileReader("file.properties")));
            System.out.println(properties.get("User"));
            System.out.println(properties.get("Password"));
            System.out.println(properties.getOrDefault("Login", "Host"));
            for (String s : properties.stringPropertyNames()) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void randoms() {
        Random rnd = new Random(43);
        System.out.println(rnd.nextInt(10));
        int[] ints = rnd.ints(10, -1, 5).toArray();
        System.out.println(Arrays.toString(ints));
    }

    private static void BigDecimalTest() {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i < 1000; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
        BigDecimal big1 = BigDecimal.valueOf(1.0);
        BigDecimal big2 = BigDecimal.valueOf(3.0);
        BigDecimal divide = big1.divide(big2, MathContext.DECIMAL128);
        System.out.println(divide);

        BigInteger a = BigInteger.valueOf(1001);
        BigInteger b = BigInteger.valueOf(65);
        BigInteger[] bigInteger = a.divideAndRemainder(b);
        System.out.println(bigInteger[0] + " - " + bigInteger[1]);
    }
}