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
		if (sum == number) {
			return true;
		}
		return false;
	}

	private static boolean isNaturalNumber(int number) {
		if (number > 0) {
			return true;
		} else {
			return false;
		}
	}
}
