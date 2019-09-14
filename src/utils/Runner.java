package utils;

import chapter.one.LoopsAndBranch;
import chapter.one.NestedLoops;
import chapter.one.SimpleLoops;
import chapter.two.IntegerNumbers;

import java.util.Scanner;

public class Runner {

    public static void menu() {
        System.out.println("Enter task number: ");
        Scanner sc = new Scanner(System.in);
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
            case "task87":
                runTask87();
                break;
            case "task88g":
                runTask88g();
                break;
            case "task107":
                runTask107();
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
            case "task560":
                runTask560();
                break;
            case "task226":
                runTask226();
                break;
            case "task559":
                runTask559();
                break;
            case "task 323":
                runTask323();
            case "task243a":
                runTask243a();
                break;
            case "task561":
                runTask561();
                break;
            default:
                System.out.println("Wrong task number");
        }
    }

    static void runTask182() {
        LoopsAndBranch loopsAndBranch = new LoopsAndBranch();
        loopsAndBranch.task182(-10, 10);
    }


    static void runTask88g() {
        SimpleLoops simpleLoops = new SimpleLoops();
        SimpleLoops.task88g(99);
    }

    static void runTask86a() {
        SimpleLoops simpleLoops = new SimpleLoops();
        System.out.println(SimpleLoops.task86a(666));
    }

    static void runTask88() {
        SimpleLoops simpleLoops = new SimpleLoops();
        System.out.println(SimpleLoops.task88(5569));
    }

    static void runTask88_c() {
        SimpleLoops simpleLoops = new SimpleLoops();
        SimpleLoops.task88_c(125);
    }

    static void runTask87() {
        SimpleLoops.task87(123456, 3);
    }

    static void runTask107() {
        System.out.println("Write number m>1");
        System.out.println(SimpleLoops.task107(42));
    }

    static void runTask224() {
        System.out.println("This task show you all divisors for number 26");
        System.out.println(LoopsAndBranch.task224(26));
    }

    static void runTask178b() {
        int[] mas = {3, 4, 5, 15, 30, 9};
        System.out.println(LoopsAndBranch.task178b(6, mas));
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

    static void runTask226() {
        System.out.println(LoopsAndBranch.task226(5, 10));
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

    static void runTask323() {
        System.out.println("Get all coprime integers <50");
        System.out.println(NestedLoops.task330(50));
    }
}