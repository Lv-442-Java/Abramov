package chapter.two;

import java.util.ArrayList;
import java.util.List;

public class IntegerNumbers {

    public static void task560() {
        // for not repeating numbers
        List<Integer> friendNumbers = new ArrayList<Integer>();
        for (int i = 200; i <= 300; i++) {
            //
            if (friendNumbers.contains(i)) {
                continue;
            }
            //
            int maybeFriend = sumOfDividers(i);
            if (maybeFriend >= 200 && maybeFriend <= 300) {
                if (sumOfDividers(maybeFriend) == i) {
                    //
                    friendNumbers.add(i);
                    friendNumbers.add(maybeFriend);
                    //
                    System.out.println(i + " " + maybeFriend);
                }
            }
        }
    }

    private static int sumOfDividers(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static List<Integer> task559(int n) {
        List<Integer> result = new ArrayList<>();
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        for (int k = 2; ((1 << k) - 1) <= n; k++) {
            int num = (1 << k) - 1;
            if (prime[num]) {
                result.add(num);
            }
        }
        return result;
    }

    public static String task561(int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            int last = square % 10;
            if (i == last) {
                result = result + i + "\n";
            }
        }
        return result;
    }

    public static void task554(int n) {
        int a, b, c;

        for (c = 1; c <= n; c++) {
            for (b = 1; b <= c; b++) {
                for (a = 1; a <= b; a++) {
                    if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)) {
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
    }
}
