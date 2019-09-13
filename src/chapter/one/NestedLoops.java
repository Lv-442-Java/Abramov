package chapter.one;

import java.util.ArrayList;

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
}
