package chapter.one;


import java.util.ArrayList;
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

    public static int task178b(int n, int[] sequence) {
        int amount = 0;
        for (int i = 0; i < n; i++) {
            if (sequence[i] % 3 == 0 && sequence[i] % 5 != 0) {
                amount++;
            }
        }
        return amount;
    }

    public static int task178c(int... numbers) throws NumberFormatException {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            if (isNaturalNumber(element)) {
                if (Math.sqrt(element) % 2 == 0) {
                    count++;
                }
            } else {
                throw new NumberFormatException("Incorrect data!!!The sequence contains not a natural numbers!!!");
            }
        }
        return count;
    }

    private static boolean isNaturalNumber(int number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
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

    public static List<Integer> task226(int m, int n) {
        List<Integer> result = new ArrayList<>();
        int bigger = m > n ? m : n;
        int smaller = n > m ? n : m;
        for (int i = 1; ; i++) {
            int toCheck = bigger * i;
            if (toCheck > m * n)
                break;
            if (toCheck % smaller == 0) {
                result.add(toCheck);
            }
        }
        return result;
    }
}
