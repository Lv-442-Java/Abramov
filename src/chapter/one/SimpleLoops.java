package chapter.one;

public class SimpleLoops {
    public static int task88(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }
        return reverse;
    }

    public static int task86a(int number) {
        int amount;
        for (amount = 0; number != 0; amount++) {
            number /= 10;
        }
        return amount;
    }

    public static void task88_c(int n) {

        int[] digitArray;
        int decimal = 0;
        int tmp = n;

        while (n > 0) {
            decimal++;
            n /= 10;
        }
        digitArray = new int[decimal];
        n = tmp;
        for (int i = 0; i < decimal; i++) {
            digitArray[i] = n % 10;
            n /= 10;
        }
        tmp = digitArray[0];
        digitArray[0] = digitArray[decimal - 1];
        digitArray[decimal - 1] = tmp;

        for (int i = decimal - 1; i >= 0; i--) {
            System.out.print(digitArray[i]);


        }
    }
}
