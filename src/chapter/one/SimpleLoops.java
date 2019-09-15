package chapter.one;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class SimpleLoops {
    public static int task88(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }
        return reverse;
    }

    public static int task86a(int number) {
        int amount;
        for (amount = 0; number != 0; amount++) {
            number /= 10;
        }
        return amount;
    }

    public static int task86b(int n) {

        if (n <= 0) {
            System.err.println("n must be greater than zero");
            return -1;
        }

        int n2 = n;
        int n1 = n;
        int sum = 0;

        while (n2 > 0) {
            n1 /= 10;
            sum += n2 - n1*10;
            n2 = n1;
        }

        return sum;
    }

    public static void task88_c(int n) {

        int[] digitArray;
        int decimal = 0;
        int tmp = n;

        while (n > 0) {
            decimal++;
            n /= 10;
        }
        digitArray = new int[decimal];
        n = tmp;
        for (int i = 0; i < decimal; i++) {
            digitArray[i] = n % 10;
            n /= 10;
        }
        tmp = digitArray[0];
        digitArray[0] = digitArray[decimal - 1];
        digitArray[decimal - 1] = tmp;

        for (int i = decimal - 1; i >= 0; i--) {
            System.out.print(digitArray[i]);


        }
    }

    public static void task88g(int n) {
        // add "1" before and after number "n"
        if (n > 0) {

            String number = Integer.toString(n);

            number = "1" + number + "1";
            int newN = parseInt(number);

            System.out.println(newN);
        } else System.out.println("Wrong input values");
    }


    public static int task87(long n, int m) {
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int task107(int m) {
        int result = 0;
        if (m > 1) {
            int k = 0;
            while (Math.pow(4, k) < m) {
                k++;
            }
            result = --k;
        } else
            System.out.println("Wrong input");
        return result;
    }

    public static int task108(int n) {

        if (n <= 0) {
            System.err.println("n must be greater than zero");
            return -1;
        }
        if (n == 1) return 1;

        int degree = 1;

        for (int i = 0; i < Integer.bitCount(Integer.MAX_VALUE) - 1; i++) {
            degree = degree << 1;
            if (degree > n) return degree;
        }

        return -1;

    }

    public static boolean task88a(int number) {
        return getNumeralsFromNumber(number * number).contains(3);
    }

    private static List<Integer> getNumeralsFromNumber(int number) {
        List<Integer> numerals = new ArrayList<Integer>();
        do {
            numerals.add(number % 10);
            number /= 10;
        } while (number != 0);
        return numerals;
    }

}
