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

	public static List<Integer> task559(int n){
		List<Integer> result = new ArrayList<>();
		boolean[] prime=new boolean[n + 1];
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
		for (int k = 2; (( 1 << k) - 1) <= n; k++) {
			int num = ( 1 << k) - 1;
			if (prime[(int)(num)]) {
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

	public static int[][] task555(int n) {

		if (n <= 0) {
			System.err.println("n must be greater than zero");
			return null;
		}

		int[][] triangle = new int[n][];

		triangle[0] = new int[] {1};
		if (n == 1) return triangle;
		triangle[1] = new int[] {1, 1};
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

	public static void task562(){

		int k = 1;
		int s = 1;
		for (int i =10; i<100; i++){
			k = i;
			s = k/10 + k%10;
			if (s*s == i){
				System.out.println(k);
			}
		}
		for (int i = 100; i<1000; i++){
			k = i;
			while (k>0){
				s = k%10;
				k= k/10;
				if (Math.pow(s,3) == i){
					System.out.println(k);
				}
			}

		}
		for (int i = 1000;i<10000; i++){
			k = i;
			while (k>0){
				s = k%10;
				k= k/10;
				if (Math.pow(s,4) == i){
					System.out.println(k);
				}
			}

		}

	}

}
