package chapter.one;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LoopsAndBranch {
    public static ArrayList task224(int n) {
        ArrayList array = new ArrayList();
        for (int divisor = n - 1; divisor > 0; divisor--) {
            if (n % divisor == 0) {
                array.add(divisor);
            }
        }
        return array;
    }

    public double task241(int n, double x) {
        double result = 0.0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result = Math.pow(-1, Math.abs(Math.sqrt(i))) / i * Math.pow(x, i);
                result += result;
                System.out.println(result);
            }
        }
        return result;
    }

    public static List<Integer> task182(int[] arrayList) {
        List<Integer> outputList = new ArrayList<>();
        int sum = 0;
        int count = 0;
        for (int x : arrayList) {
            if (((x % 5) == 0) & (x % 7 != 0)) {
                sum += x;
                count++;
            }
        }
        outputList.add(count);
        outputList.add(sum);
        return outputList;
    }


    public static int task178b(int[] sequence) {
        int amount = 0;
        for (int elem : sequence) {
            if (elem % 3 == 0 && elem % 5 != 0) {
                amount++;
            }
        }
        return amount;
    }

    public static int task178c(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            if (Math.sqrt(element) % 2.0 == 0.0) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> task227(int firstNumber, int secondNumber) {
        if (Math.abs(firstNumber) < Math.abs(secondNumber)) {
            return findDividers(Math.abs(firstNumber), Math.abs(secondNumber));
        } else {
            return findDividers(Math.abs(secondNumber), Math.abs(firstNumber));
        }
    }

    private static List<Integer> findDividers(int lessNumber, int moreNumber) {
        List<Integer> dividers = new ArrayList<Integer>();
        for (int i = 1; i <= lessNumber / 2; i++) {
            if (lessNumber % i == 0 && moreNumber % i == 0) {
                dividers.add(i);
                dividers.add(-i);
            }
        }
        if (moreNumber % lessNumber == 0) {
            dividers.add(lessNumber);
            dividers.add(-lessNumber);
        }
        Collections.sort(dividers);
        return dividers;
    }

    public static List<Integer> task225(int n) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        int end = (int) Math.floor(Math.sqrt(n));

        for (int i = 2; i <= end; i++) {

            if (n % (i * i) == 0 && n % (i * i * i) != 0) result.add(i);
        }

        return result;
    }

    public static List<Integer> task226(int m, int n) {
        List<Integer> result = new ArrayList<>();
        int bigger;
        int smaller;
        if (m > n) {
            bigger = m;
            smaller = n;
        } else {
            smaller = m;
            bigger = n;
        }
        int i = 1;
        int toCheck = 0;
        while (toCheck < m * n) {
            toCheck = bigger * i;
            if (toCheck % smaller == 0) {
                result.add(toCheck);
            }
            i++;
        }
        return result;
    }

    public static ArrayList<int[]> task243a(double n) {
        int[] result = new int[2];
        ArrayList<int[]> list = new ArrayList<int[]>();
        int x;
        int y;
        int r = 1;
        double limit = Math.pow(n, 1.0 / 2.0) - 1;
        for (x = 1; x < limit; x++) {
            for (y = r; y < limit; y++) {
                int z = x * x + y * y;
                if (z == n) {
                    result[0] = x;
                    result[1] = y;
                    list.add(result);
                } else if (z > n) {
                    break;
                }
            }
            r++;
        }
        return list;
    }

    public static int task178h(int[] arg) {
        int amount = 0;
        for (int i = 1; i < arg.length - 1; i++) {
            if (arg[i] < (arg[i - 1] + arg[i + 1]) / 2.0) {
                amount = amount + 1;
            }
        }
        return amount;
    }

    public static int task178d(int[] array, int n) {

        int result = 1;
        int k = 0;
        for (int i = 0; i < n; i++) {
            result *= i;
            if (Math.pow(2, i) > array[i] && array[i] < result) {
                k++;
            }
        }
        return k;
    }

    public static ArrayList<String> task243b(int n) {

        int x = 0;
        int y = 0;
        ArrayList<String> result = new ArrayList<>();

        for (int i = 1; i < Math.sqrt(n); i++) {
            for (int j = 1; j < Math.sqrt(n); j++) {
                int squareX = i*i;
                int squareY =j*j;
                if (n == squareX + squareY) {

                    x = squareX;
                    y = squareY;

                    result.add(String.valueOf(x) + "+" + String.valueOf(y));

                    if (squareX + squareY > n) {
                        break;
                    }

                }
            }
        }

        return result;

    }

    public static String task242(int n) {
        double rezult = 0.0;
        for (int k = 0; k < n; k++)
            rezult = (Math.pow((-1), k * (k - 1))) / factorial(n);
        return String.format("%.10f", rezult);
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Argument " + n + " les than zero!!!");
        } else {
            int rezult = 1;
            for (int i = n; i > 0; i--) {
                rezult *= i;
            }
            return rezult;
        }
    }
}

