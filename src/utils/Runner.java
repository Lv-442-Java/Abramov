package utils;

import chapter.one.SimpleLoops;

import java.util.Scanner;

public class Runner {

    public static void menu() {
        System.out.println("Enter task number: ");
        Scanner sc = new Scanner(System.in);
        String taskNumber = sc.nextLine();
        switch (taskNumber) {
            case "task88":
                rutTask88();
                break;
            default:
                System.out.println("Wrong task number");
        }
    }

    static void rutTask88() {
        SimpleLoops simpleLoops = new SimpleLoops();
        System.out.println(simpleLoops.task88(5569));
    }
}
