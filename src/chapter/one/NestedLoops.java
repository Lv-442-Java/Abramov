package chapter.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NestedLoops {
    public static ArrayList<Integer> task329(int n, int m) {
        ArrayList<Integer> result = new ArrayList<>();
        if (Math.sqrt(m) % 1 != 0) {
            return result;
        }
        int neededSum = (int) Math.sqrt(m);
        for (int i = 0; i < n; i++) {
            int testNumber = i;
            int sum = 0;
            while (testNumber != 0) {
                sum += (testNumber % 10);
                testNumber /= 10;
            }
            if (sum == neededSum) {
                result.add(i);
            }
        }
        return result;
    }

    public static int[] task332(int n) {

        int n2 = n;
        int x;
        int y;
        int z;
        int t;
        int[] mas = new int[4];
        mas[0] = (int) Math.sqrt(n2);
        n2 = n2 - mas[0] * mas[0];
        mas[1] = (int) Math.sqrt(n2);
        n2 = n2 - mas[1] * mas[1];
        mas[2] = (int) Math.sqrt(n2);
        n2 = n2 - mas[2] * mas[2];
        mas[3] = (int) Math.sqrt(n2);
        n2 = n2 - mas[3] * mas[3];
        return mas;
    }


    public static List<Integer> task330(int number) {
        List<Integer> perfectNumbers = new ArrayList<Integer>();
        for (int i = 1; i < number; i++) {
            if (isPerfect(i)) {
                perfectNumbers.add(i);
            }
        }
        return perfectNumbers;
    }

    private static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
            if (sum > number) {
                return false;
            }
        }
        return sum == number;
    }

    private static boolean isNaturalNumber(int number) {
        return number > 0;
    }

    public static int[] task331a(int n) {
        int x, y, z;
        int[] result = new int[3];
        double limit = Math.pow(n, 1.0 / 2.0) + 1;
        for (x = 1; x < limit; x++) {
            for (y = 1; y < limit; y++) {
                for (z = 1; z < limit; z++) {
                    int s = x * x + y * y + z * z;
                    if (s == n) {
                        result[0] = x;
                        result[1] = y;
                        result[2] = z;
                        return result;
                    } else if (s > n) {
                        break;
                    }
                }
            }
        }
        return result;
    }

    private static int GCD(int a, int b) {
        if (b == 0) return a;

        return GCD(b, a % b);
    }

    public static List<Integer> task323(int n) {
        int nature = 1;
        List<Integer> taskResult = new ArrayList<>();
        while (nature < n) {
            if (GCD(nature, n) == 1) {
                taskResult.add(nature);
            }
            nature++;
        }
        return taskResult;
    }

    private static int[] erastofen(int base) {
        int baseLength = base;
        int[] result = new int[baseLength];
        int length = 0;
        for (int i = 2; i < baseLength; i++) {
            if (result[i] == -1) continue;
            length++;
            for (int j = i + i; j < baseLength; j += i) {
                result[j] = -1;
            }
        }
        int[] result1 = new int[length];
        for (int i = 2, j = 0; i < baseLength; i++) {
            if (result[i] == -1) continue;
            result1[j] = i;
            j++;
        }
        return result1;
    }

    public static List<Integer> task325(int n) {
        int[] simpleNumbers = erastofen(n / 2 + 1);
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < simpleNumbers.length; i++) {
            if (n % simpleNumbers[i] == 0) result.add(simpleNumbers[i]);
        }
        return result;
    }

    public static ArrayList<String> task331b(int n) {


        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++) {
            for (int j = 1; j < Math.sqrt(n); j++) {
                for (int z = 1; z < Math.sqrt(n); z++) {

                    int squareX = i * i;
                    int squareY = j * j;
                    int squareZ = z * z;

                    if (n == squareX + squareY + squareZ) {

                        result.add(String.valueOf(squareX) + "+" + String.valueOf(squareX) + "+" + String.valueOf(squareX));


                    }
                    if (squareX + squareY + squareZ > n) {
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static String task340(int m, int[] list) {
        String rezult = null;
        boolean check = false;
        for (int i = 0; i < list.length; i++) {
            for (int j = i; j < list.length; j++) {
                for (int k = j; k < list.length; k++) {
                    if (list[i] + list[j] + list[k] == m) {
                        check = true;
                        rezult = list[i] + " " + list[j] + " " + list[k];
                    }
                }
            }
        }
        if (!check)
            rezult = "Can't find numbers! Please try again!";
        return rezult;
    }
}
