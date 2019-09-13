package utils;

import chapter.one.SimpleLoops;
import chapter.one.LoopsAndBranch;

import java.util.Scanner;

import static chapter.one.NestedLoops.task329;

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
            case "task 87":
                runTask87();
                break;
            case "task 107":
                runTask107();
                break;
            case "task 224":
                runTask224();
                break;
            case "task178b":
                runTask178b();
                break;
            case "task329":
                runTask329();
                break;
            default:
                System.out.println("Wrong task number");
        }
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

    static void runTask224(){
        System.out.println("This task show you all divisors for number 26");
        System.out.println(LoopsAndBranch.task224(26));
    }

    static void runTask178b(){
        int [] mas = {3,4,5,15,30,9};
        System.out.println(LoopsAndBranch.task178b(6, mas));
    }

    static void runTask329(){
        System.out.println(task329(37,36));
    }
    
    static void runTask88a() {
    	System.out.println(SimpleLoops.task88a(66));
    }
}