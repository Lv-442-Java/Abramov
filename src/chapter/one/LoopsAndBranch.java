package chapter.one;


import java.util.ArrayList;

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
}
