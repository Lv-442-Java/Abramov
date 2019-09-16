package utils;

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
                runTask88();
                break;
            case "task88c":
                runTask88_c();
                break;
            case "task86a":
                runTask86a();
                break;
            case "task86b":
                runTask86b();
                break;
            case "task87":
                runTask87(sc);
                break;
            case "task88g":
                runTask88g();
                break;
            case "task107":
                runTask107();
                break;
            case "task108":
                runTask108();
                break;
            case "task224":
                runTask224();
                break;
            case "task178b":
                runTask178b(sc);
                break;
            case "task182":
                runTask182();
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
                runTask554();
                break;
            case "task560":
                runTask560();
                break;
            case "task225":
                runTask225();
                break;
            case "task226":
                runTask226(sc);
                break;
            case "task555":
                runTask555();
                break;
            case "task559":
                runTask559(sc);
                break;
            case "task243a":
                runTask243a();
                break;
            case "task561":
                runTask561();
                break;
            case "task331a":
                runTask331a();
                break;
            case "task323":
                runTask323();
                break;
            case "task325":
                runTask325();
                break;
            case "task178h":
                runTask178h();
                break;
            case "task178d":
                runTask178d();
                break;
            case "task243b":
                runTask243b();
                break;
            case "task331b":
                runTask331b();
                break;
            case "task332":
                runTask332();
                break;
            case "task562":
                runTask562();
                break;
            case "task241":
                runTask241();
                break;

            default:
                System.out.println("Wrong task number");
        }
        sc.close();
    }

    static void runTask332() {
        NestedLoops nestedLoops = new NestedLoops();
        nestedLoops.task332(10);
    }

    static void runTask241() {
        LoopsAndBranch loopsAndBranch = new LoopsAndBranch();
        loopsAndBranch.task241(10, 8.8);
    }

    private static void runTask555() {
        System.out.println(IntegerNumbers.task555(42));
    }

    private static void runTask178h() {
        System.out.println(LoopsAndBranch.task178h(7, 2, 4, 7, 11, 12, 15, 84, 8, 7));
    }

    static void runTask331a() {
        System.out.println(NestedLoops.task331a(500));
    }

    static void runTask182() {
        LoopsAndBranch loopsAndBranch = new LoopsAndBranch();
        LoopsAndBranch.task182(-10, 10);
    }

    static void runTask88g() {
        SimpleLoops simpleLoops = new SimpleLoops();
        SimpleLoops.task88g(99);
    }

    static void runTask86a() {
        SimpleLoops simpleLoops = new SimpleLoops();
        System.out.println(SimpleLoops.task86a(666));
    }

    static void runTask86b() {
        System.out.println(SimpleLoops.task86b(12300456));
    }

    static void runTask88() {
        SimpleLoops simpleLoops = new SimpleLoops();
        System.out.println(SimpleLoops.task88(5569));
    }

    static void runTask88_c() {
        SimpleLoops simpleLoops = new SimpleLoops();
        SimpleLoops.task88_c(125);
    }

    static void runTask87(Scanner sc) {
        Integer n;
        Integer m;
        while (true) {
            n = ConsoleReader.inputNaturalNumber(sc);
            m = ConsoleReader.inputNaturalNumber(sc);
            if (n.toString().length() < m) {
                System.out.println("Second number is too big!");
            } else {
                break;
            }
        }
        System.out.println("result: " + SimpleLoops.task87(n, m));
    }

    static void runTask107() {
        System.out.println("Write number m>1");
        System.out.println(SimpleLoops.task107(42));
    }

    static void runTask108() {
        System.out.println(SimpleLoops.task108(1000));
    }

    static void runTask224() {
        System.out.println("This task show you all divisors for number 26");
        System.out.println(LoopsAndBranch.task224(26));
    }

    static void runTask178b(Scanner sc) {
        System.out.println("result: " + LoopsAndBranch.task178b(ConsoleReader.inputArrayOfNaturalNumbers(sc)));
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

    static void runTask225() {
        System.out.println(LoopsAndBranch.task225(144));
    }

    static void runTask226(Scanner sc) {
        List<Integer> res = LoopsAndBranch.task226(ConsoleReader.inputNaturalNumber(sc), ConsoleReader.inputNaturalNumber(sc));
        if (res.isEmpty()) {
            System.out.println("There are no such numbers, that you need!");
        } else {
            System.out.println("result: " + res);
        }

    }

    static void runTask554() {
        System.out.println("Limit 25");
        IntegerNumbers.task554(25);
    }

    static void runTask559(Scanner sc) {
        List<Integer> result = IntegerNumbers.task559(ConsoleReader.inputNaturalNumber(sc));
        if (result.isEmpty()) {
            System.out.println("There are no such numbers,less then n!");
        }
        System.out.println("result: " + result);
    }

    static void runTask243a() {
        System.out.println(LoopsAndBranch.task243a(100));
    }

    static void runTask561() {
        System.out.println(IntegerNumbers.task561(1000));
    }

    static void runTask178d() {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(LoopsAndBranch.task178d(array, 6));
    }


    static void runTask243b() {
        LoopsAndBranch.task243b(100);
    }

    static void runTask323() {
        System.out.println("Get all coprime integers <50");
        System.out.println(NestedLoops.task323(50));
    }

    static void runTask325() {
        System.out.println(NestedLoops.task325(2001));
    }

    static void runTask331b() {
        System.out.println(NestedLoops.task331b(50));
    }

    static void runTask562() {
        IntegerNumbers.task562();
    }
}
