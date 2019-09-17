package chapter.one;

import java.util.ArrayList;
import java.util.List;

public class NestedLoops {
    public static ArrayList<Integer> task329(int n, int m) {
        ArrayList<Integer> result = new ArrayList<>();
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

    public static void task332(int n) {

        int n2 = n;
        int x;
        int y;
        int z;
        int t;

        x = (int) Math.sqrt(n2);
        n2 = n2 - x * x;
        y = (int) Math.sqrt(n2);
        n2 = n2 - y * y;
        z = (int) Math.sqrt(n2);
        n2 = n2 - z * z;
        t = (int) Math.sqrt(n2);
        n2 = n2 - t * t;
        System.out.println("x = " + x + " y = " + y + " z = " + z + " t = " + t);
        System.out.println(n + " = " + x * x + " + " + y * y + " + " + z * z + " + " + t * t);
    }


    public static List<Integer> task330(int number) throws NumberFormatException {
        List<Integer> perfectNumbers = new ArrayList<Integer>();
        if (!isNaturalNumber(number)) {
            throw new NumberFormatException("Incorrect data!!!The number isn`t natural!!!");
        }
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

    public static String task331a(int n) {
        String result = "";
        int x, y, z;
        for (x = 1; x < n * n; x++) {
            int s = x * x + 1;
            if (s > n) {
                break;
            }
            for (y = 1; y < n * n; y++) {
                s = x * x + y * y + 1;
                if (s > n) {
                    break;
                }
                for (z = 1; z < n * n; z++) {
                    s = x * x + y * y + z * z;
                    if (s == n) {
                        result = result + "x: " + x + " y: " + y + " z: " + z + "\n";
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

        if (n <= 0) {
            throw new IllegalArgumentException("The argument 'int n' cannot be less than one");
        }

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

                    int squareX = i*i;
                    int squareY = j*j;
                    int squareZ = z*z;

                    if (n == squareX + squareY + squareZ) {

                        result.add(String.valueOf(squareX) + "+" +  String.valueOf(squareX) + "+" + String.valueOf(squareX));


                    }
                    if (squareX + squareY + squareZ > n) {
                        break;
                    }
                }
            }
        }
        return result;
    }
}
