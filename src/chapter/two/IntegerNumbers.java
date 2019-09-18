package chapter.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerNumbers {

    public static List<int[]> task560() {
        List<int[]> friendNumbers = new ArrayList<int[]>();
        for (int i = 200; i <= 300; i++) {
            int maybeFriend = sumOfDividers(i);
            if (maybeFriend >= 200 && maybeFriend <= 300) {
                if (sumOfDividers(maybeFriend) == i) {
                    boolean isInList = false;
                    for (int[] arrayFromList : friendNumbers) {
                        if (arrayFromList[0] == maybeFriend && arrayFromList[1] == i) ;
                        isInList = true;
                        break;
                    }
                    if (!isInList) {
                        int[] array = new int[2];
                        array[0] = i;
                        array[1] = maybeFriend;
                        friendNumbers.add(array);
                    }
                }
            }
        }
        return friendNumbers;
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


    public static ArrayList<Integer> task561(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            String number = Integer.toString(i);
            int square = i * i;
            int last;
            int y;
            String z = "";
            int j = 0;
            while(j < number.length())
            {
                y = square % 10;
                z = y + "" +z;
                square = square / 10;
                j++;
            }
            last = Integer.parseInt(z);
            if (i == last) {
                result.add(i);
            }
        }
        return result;
    }

    public static List<ArrayList<Integer>> task554(int n) {
        int a, b, c;
        List<ArrayList<Integer>> pythagoreanTriples = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();
        for (c = 1; c <= n; c++) {
            for (b = 1; b <= c; b++) {
                for (a = 1; a <= b; a++) {
                    if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)) {
                        number.add(a);
                        number.add(b);
                        number.add(c);
                        pythagoreanTriples.add(number);
                    }
                }
            }
        }
        return pythagoreanTriples;
    }

    public static int[][] task555(int n) {

        int[][] triangle = new int[n][];

        triangle[0] = new int[]{1};
        if (n == 1) return triangle;
        triangle[1] = new int[]{1, 1};
        if (n == 2) return triangle;

        for (int i = 2; i < n; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0 || j == triangle[i].length - 1) triangle[i][j] = 1;
                else triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        return triangle;
    }


    public static ArrayList<Integer> task562() {


        ArrayList<Integer> result = new ArrayList<>();


        for (int i = 10; i < 100; i++) {

            if (check(i, 2)) {
                result.add(i);
            }
        }

        for (int i = 100; i < 1000; i++) {
            if (check(i, 3)) {
                result.add(i);
            }
        }

        for (int i = 1000; i < 10000; i++) {
            if (check(i, 4)) {
                result.add(i);
            }
        }

        return result;

    }


    private static boolean check(int n, int k) {
        int tmp = n;
        int s = 0;
        int a = 0;
        int digit = 0;
        boolean result = false;

        while (tmp > 0) {
            a = tmp % 10;
            tmp /= 10;
            digit++;
            s += Math.pow(a, k);
            if (s == n && digit == k) {
                result = true;
            }
        }
        return result;
    }

    public static List<Integer> task569(int n) {
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            if ((n % 2 == 0) || (n % 3 == 0) && (n % 5 == 0))
                list.add(n);
            n--;
        }
        Collections.sort(list);
        return list;
    }


    public static boolean task565(int k, int l, int m) {
        int count = 0;
        for (int i = k; i <= l; i++) {
            while (i == 1) {
                if (i % 2 == 0) {
                    i = i / 2;
                    count++;
                } else {
                    i = i * 3 + 1;
                    count++;
                }
            }
        }
        return count < m ? true : false;
    }

}
