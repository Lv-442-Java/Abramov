package utils;

import chapter.one.SimpleLoop;

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
        SimpleLoop simpleLoop = new SimpleLoop();
        System.out.println(simpleLoop.task88(5569));
    }
}
