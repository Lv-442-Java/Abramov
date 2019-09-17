package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import chapter.one.LoopsAndBranch;
import chapter.one.NestedLoops;
import chapter.one.SimpleLoops;
import chapter.two.IntegerNumbers;

public class Runner {

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter task number: ");
        String taskNumber = sc.nextLine();
        switch (taskNumber) {
            case "task88":
                runTask88(sc);
                break;
            case "task88c":
                runTask88c(sc);
                break;
            case "task86a":
                runTask86a(sc);
                break;
            case "task86b":
                runTask86b(sc);
                break;
            case "task87":
                runTask87(sc);
                break;
            case "task88g":
                runTask88g(sc);
                break;
            case "task107":
                runTask107(sc);
                break;
            case "task108":
                runTask108(sc);
                break;
            case "task224":
                runTask224(sc);
                break;
            case "task178b":
                runTask178b(sc);
                break;
            case "task182":
                runTask182(sc);
                break;
            case "task329":
                runTask329(sc);
                break;
            case "task88a":
                runTask88a(sc);
                break;
            case "task178c":
                runTask178c(sc);
                break;
            case "task227":
                runTask227(sc);
                break;
            case "task330":
                runTask330(sc);
                break;
            case "task554":
                runTask554(sc);
                break;
            case "task560":
                runTask560();
                break;
            case "task225":
                runTask225(sc);
                break;
            case "task226":
                runTask226(sc);
                break;
            case "task555":
                runTask555(sc);
                break;
            case "task559":
                runTask559(sc);
                break;
            case "task243a":
                runTask243a(sc);
                break;
            case "task561":
                runTask561(sc);
                break;
            case "task331a":
                runTask331a();
                break;
            case "task323":
                runTask323(sc);
                break;
            case "task325":
                runTask325(sc);
                break;
            case "task178h":
                runTask178h(sc);
                break;
            case "task178d":
                runTask178d(sc);
                break;
            case "task243b":
                runTask243b(sc);
                break;
            case "task331b":
                runTask331b(sc);
                break;
            case "task332":
                runTask332(sc);
                break;
            case "task562":
                runTask562();
                break;
            case "task241":
                runTask241(sc);
                break;
            case "task565":
                runTask565(sc);
                break;
            default:
                System.out.println("Wrong task number");
        }
        sc.close();
    }

    private static void runTask565(Scanner sc) {
        IntegerNumbers integerNumbers = new IntegerNumbers();
        System.out.println("Enter number biggest than 1 ");
        int k = ConsoleReader.inputNaturalNumber(sc);
        System.out.println("Enter number biggest than k ");
        int l = ConsoleReader.inputNaturalNumber(sc);
        System.out.println("Enter third number ");
        int m = ConsoleReader.inputNaturalNumber(sc);
        System.out.println(integerNumbers.task565(k, l, m));
    }

    static void runTask332(Scanner sc) {
        NestedLoops nestedLoops = new NestedLoops();
        for (int x : nestedLoops.task332(ConsoleReader.inputNaturalNumber(sc))) {
            System.out.println(x);
        }
    }

    static void runTask241(Scanner sc) {
        LoopsAndBranch loopsAndBranch = new LoopsAndBranch();
        System.out.println(loopsAndBranch.task241(ConsoleReader.inputNaturalNumber(sc), ConsoleReader.inputDoubleNumber(sc)));
    }

    private static void runTask555(Scanner sc) {

        int num;

        num = ConsoleReader.inputNaturalNumber(sc);

        System.out.println(Arrays.deepToString(IntegerNumbers.task555(num)));
    }

    private static void runTask178h(Scanner sc) {
        System.out.println(LoopsAndBranch.task178h(ConsoleReader.inputArrayOfNaturalNumbers(sc)));
    }

    static void runTask331a() {
        System.out.println(NestedLoops.task331a(500));
    }

    static void runTask182(Scanner sc) {
        LoopsAndBranch loopsAndBranch = new LoopsAndBranch();
        System.out.println(loopsAndBranch.task182(ConsoleReader.inputArrayOfNaturalNumbers(sc)));
        System.out.println("Count" + " " + "Sum ");
    }

    static void runTask88g(Scanner sc) {
        SimpleLoops simpleLoops = new SimpleLoops();
        System.out.println(simpleLoops.task88g(ConsoleReader.inputNaturalNumber(sc)));
    }

    static void runTask86a(Scanner sc) {
        int num;
        num = ConsoleReader.inputNaturalNumber(sc);
        System.out.println(SimpleLoops.task86a(num));
    }

    static void runTask86b(Scanner sc) {

        int num;

        num = ConsoleReader.inputNaturalNumber(sc);

        System.out.println(SimpleLoops.task86b(num));
    }

    static void runTask88(Scanner sc) {
        System.out.println("Result: " + SimpleLoops.task88(ConsoleReader.inputNaturalNumber(sc)));
    }

    static void runTask88c(Scanner sc ) {

        Integer n;
        n = ConsoleReader.inputNaturalNumber(sc);
        System.out.println("result: " + SimpleLoops.task88c(n));


    }

    static void runTask87(Scanner sc) {
        int n;
        int m;
        while (true) {
            n = ConsoleReader.inputNaturalNumber(sc);
            m = ConsoleReader.inputNaturalNumber(sc);
            if (Integer.toString(n).length() < m) {
                System.out.println("Second number is too big!");
            } else {
                break;
            }
        }
        System.out.println("result: " + SimpleLoops.task87(n, m));
    }

    static void runTask107(Scanner sc) {
        int num;
        num = ConsoleReader.inputNaturalNumber(sc);
        System.out.println(SimpleLoops.task107(num));
    }

    static void runTask108(Scanner sc) {

        int num;

        num = ConsoleReader.inputNaturalNumber(sc);

        System.out.println(SimpleLoops.task108(num));
    }

    static void runTask224(Scanner sc) {
        System.out.println("This task show you all divisors for number: ");
        int num;
        num = ConsoleReader.inputNaturalNumber(sc);
        System.out.println(LoopsAndBranch.task224(num));
    }

    static void runTask178b(Scanner sc) {
        System.out.println("Result: " + LoopsAndBranch.task178b(ConsoleReader.inputArrayOfNaturalNumbers(sc)));
    }

    static void runTask329(Scanner sc) {
        List<Integer> result = NestedLoops.task329(ConsoleReader.inputNaturalNumber(sc), ConsoleReader.inputNaturalNumber(sc));
        if (result.isEmpty()) {
            System.out.println("There are no such numbers!");
        } else {
            System.out.println("result: " + result);
        }

    }

    static void runTask88a(Scanner sc) {
        System.out.println(SimpleLoops.task88a(ConsoleReader.inputNaturalNumber(sc)));
    }

    static void runTask178c(Scanner sc) {
        System.out.println(LoopsAndBranch.task178c(ConsoleReader.inputArrayOfNaturalNumbers(sc)));
    }

    static void runTask227(Scanner sc) {
        System.out.println(LoopsAndBranch.task227(ConsoleReader.inputIntegerNumber(sc), ConsoleReader.inputIntegerNumber(sc)));
    }

    static void runTask330(Scanner sc) {
        System.out.println(NestedLoops.task330(ConsoleReader.inputNaturalNumber(sc)));
    }

    static void runTask560() {
        IntegerNumbers.task560();
    }

    static void runTask225(Scanner sc) {

        int num;

        num = ConsoleReader.inputNaturalNumber(sc);

        System.out.println(LoopsAndBranch.task225(num));
    }

    static void runTask226(Scanner sc) {
        List<Integer> res = LoopsAndBranch.task226(ConsoleReader.inputNaturalNumber(sc), ConsoleReader.inputNaturalNumber(sc));
        if (res.isEmpty()) {
            System.out.println("There are no such numbers, that you need!");
        } else {
            System.out.println("result: " + res);
        }

    }

    static void runTask554(Scanner sc) {
        System.out.println("Put the limit number: ");
        List<ArrayList<Integer>> result = IntegerNumbers.task554(ConsoleReader.inputNaturalNumber(sc));
        if (result.isEmpty()) {
            System.out.println("There are no such numbers");
        }
        System.out.println(result);
    }

    static void runTask559(Scanner sc) {
        List<Integer> result = IntegerNumbers.task559(ConsoleReader.inputNaturalNumber(sc));
        if (result.isEmpty()) {
            System.out.println("There are no such numbers,less then n!");
        }
        System.out.println("result: " + result);
    }

    static void runTask243a(Scanner sc) {
        ArrayList<int[]> result = LoopsAndBranch.task243a(ConsoleReader.inputNaturalNumber(sc));
        if (result.isEmpty()) {
            System.out.println("Result not found!");
        } else {
            for (int[] array : result) {
                System.out.println("x: " + array[0] + " y: " + array[1]);
            }
        }
    }

    static void runTask561(Scanner sc) {
        ArrayList<Integer> result = IntegerNumbers.task561(ConsoleReader.inputNaturalNumber(sc));
        if (result.isEmpty()) {
            System.out.println("Result nit found!");
        } else {
            for (int a : result) {
                System.out.println("Result: " + a);
            }
        }
    }

    static void runTask178d (Scanner sc) {

        Integer n;
        int [] array;
        while (true) {
            n = ConsoleReader.inputNaturalNumber(sc);
            array = ConsoleReader.inputArrayOfNaturalNumbers(sc);

            if (array.length > n) {
                System.out.println("Length of array is to big!");
            }
            else {
                break;
            }
        }
        System.out.println("result: " + LoopsAndBranch.task178d(array, n));
    }


    static void runTask243b(Scanner sc) {
        Integer n = ConsoleReader.inputNaturalNumber(sc);
        System.out.println("result: " + LoopsAndBranch.task243b(n));

    }

    static void runTask323(Scanner sc) {
        System.out.println("Get all coprime integers for number:");
        int num;
        num = ConsoleReader.inputNaturalNumber(sc);
        System.out.println(NestedLoops.task323(num));
    }

    static void runTask325(Scanner sc) {

        int num;

        num = ConsoleReader.inputNaturalNumber(sc);

        System.out.println(NestedLoops.task325(num));
    }

    static void runTask331b(Scanner sc) {
        Integer n = ConsoleReader.inputNaturalNumber(sc);
        System.out.println("result: " + NestedLoops.task331b(n));
    }

    static void runTask562() {

        System.out.println("result: ");
        System.out.println(IntegerNumbers.task562());


    }
}
