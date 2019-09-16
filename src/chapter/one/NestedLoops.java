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

    public static int GCD(int a, int b) {
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
    
    public static String task340(){       
        int m=107;
        String rezult =null;
        boolean check = false;       
        int [] list = {2,50,10,50,45,32,5,54,23,97,100,67,78,34,2,4,1,76,90,43};        
        for(int i=0;i<list.length;i++){
            for(int j=i;j<list.length;j++){
                for(int k =j;k<list.length;k++)
                    if(list[i] + list[j] + list[k] == m){
                        check = true;
                        rezult =  list[i] +" "+ list[j] +" "+ list[k];                                        
                }                    
            }
        }        
        if(!check)            
            rezult = "Can't find numbers! Please try again!";       
        return rezult;       
    }

}
