package utils;

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
                runTask88c(sc);
                break;
            case "task86a":
                runTask86a();
                break;
            case "task86b":
                runTask86b();
                break;
            case "task87":
                runTask87();
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
                runTask178b();
                break;
            case "task182":
                runTask182();
                break;
            case "task329":
                runTask329();
                break;
            case "task88a":
                runTask88a();
                break;
            case "task178c":
                runTask178c();
                break;
            case "task227":
                runTask227();
                break;
            case "task330":
                runTask330();
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
                runTask226();
                break;
            case "task555":
                runTask555();
                break;
            case "task559":
                runTask559();
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
                runTask178d(sc);
                break;
            case "task243b":
                runTask243b(sc);
                break;
            case "task331b":
                runTask331b(sc);
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

    static void runTask88c(Scanner sc ) {

        Integer n;
        n = ConsoleReader.inputNaturalNumber(sc);
        System.out.println("result: " + SimpleLoops.task88c(n));


    }

    static void runTask87() {
        SimpleLoops.task87(123456, 3);
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

    static void runTask178b() {
        int[] mas = {3, 4, 5, 15, 30, 9};
        System.out.println(LoopsAndBranch.task178b(mas));
    }

    static void runTask329() {
        System.out.println(NestedLoops.task329(37, 36));
    }

    static void runTask88a() {
        System.out.println(SimpleLoops.task88a(66));
    }

    static void runTask178c() {
        System.out.println(LoopsAndBranch.task178c(66, 36, 23, 16, 12, 57, 64));
    }

    static void runTask227() {
        System.out.println(LoopsAndBranch.task227(100, 134));
    }

    static void runTask330() {
        System.out.println(NestedLoops.task330(100));
    }

    static void runTask560() {
        IntegerNumbers.task560();
    }

    static void runTask225() {
        System.out.println(LoopsAndBranch.task225(144));
    }

    static void runTask226() {
        System.out.println(LoopsAndBranch.task226(5, 10));
    }

    static void runTask554() {
        System.out.println("Limit 25");
        IntegerNumbers.task554(25);
    }

    static void runTask559() {
        System.out.println(IntegerNumbers.task559(31));
    }

    static void runTask243a() {
        System.out.println(LoopsAndBranch.task243a(100));
    }

    static void runTask561() {
        System.out.println(IntegerNumbers.task561(1000));
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

    static void runTask323() {
        System.out.println("Get all coprime integers <50");
        System.out.println(NestedLoops.task323(50));
    }

    static void runTask325() {
        System.out.println(NestedLoops.task325(2001));
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
