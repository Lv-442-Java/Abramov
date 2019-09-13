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

}
