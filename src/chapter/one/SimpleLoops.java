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
        String str = Integer.toString(number);
        return str.length();
    }

    public static int task86b(int n) {
        int n2 = n;
        int n1 = n;
        int sum = 0;
        while (n2 > 0) {
            n1 /= 10;
            sum += n2 - n1 * 10;
            n2 = n1;
        }
        return sum;
    }

    public static Integer task88c(int n) {


        int z = n;
        int k = 0;
        int i = 0;
        int num1, num2, num3, num4;
        while (z > 0) {
            k++;
            z = z / 10;
        }
        i = n % 10;

        num1 = (int) (i * Math.pow(10, k - 1));
        num2 = (int) (n / Math.pow(10, k - 1));
        num3 = num1 + num2;
        num3 = num3 - i;
        num4 = (int) (n % Math.pow(10, k - 1));
        num3 = num3 + num4;

        return num3;

    }


    public static int task88g(int n) {

        // add "1" before and after number "n"

        String number = Integer.toString(n);

        number = "1" + number + "1";
        int newN = parseInt(number);
        return newN;
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
        }
        return result;
    }

    public static int task108(int n) {
        if (n == 1) return 1;
        int degree = 1;
        for (int i = 0; i < Integer.bitCount(Integer.MAX_VALUE) - 1; i++) {
            degree = degree << 1;
            if (degree > n) return degree;
        }
        return -1;
    }

    public static boolean task88a(int number) {
        //return Arrays.asList(Integer.valueOf(number*number).toString().toCharArray()).contains('3');
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

    public static int task86h(int n) {
        int sum = 0, sign, i = 1;
        while (n > 1) {
            if (i % 2 == 0) {
                sign = -1;
            } else sign = 1;
            sum += n * sign;
            n--;
            i++;
        }
        sum += Math.pow(-1, n);
        return sum;
    }

    public static int[] task184(int p, int q, int[] list) {
        if ((p > q) && (q >= 0)) {
            for (int i = 0; i < list.length; i++) {
                if (list[i] % p == q) {
                    list[i] = 0;
                }
            }
        } else {
            throw new IllegalArgumentException("Variable < p > must be bigger than < q >  ");
        }
        return list;
    }
}

