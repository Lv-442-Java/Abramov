package utils;

import chapter.one.LoopsAndBranch;
import chapter.one.NestedLoops;
import chapter.one.SimpleLoops;
import chapter.two.IntegerNumbers;

import java.util.*;

public class Runner {

    private static Scanner sc = new Scanner(System.in);
    private static ConsoleReader consoleReader = new ConsoleReader(sc);

    public static void menu() {
        System.out.println("Enter task number: ");
        String taskNumber = sc.nextLine();
        switch (taskNumber) {
            case "task88":
                runTask88();
                break;
            case "task88c":
                runTask88c();
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
            case "task565":
                runTask565();
                break;
            case "task86h":
                runTask86h();
                break;
            case "task184":
                runTask184();
                break;
            case "task242":
                runTask242();
                break;
            case "task340":
                runTask340();
                break;
            case "task569":
                runTask569();
                break;
            default:
                System.out.println("Wrong task number");
        }
        sc.close();
    }

    private static void runTask565() {
        IntegerNumbers integerNumbers = new IntegerNumbers();
        System.out.println("Enter number biggest than 1 ");
        int k = consoleReader.inputNaturalNumber();
        System.out.println("Enter number biggest than k ");
        int l = consoleReader.inputNaturalNumber();
        System.out.println("Enter third number ");
        int m = consoleReader.inputNaturalNumber();
        System.out.println(IntegerNumbers.task565(k, l, m));
    }

    static void runTask332() {
        NestedLoops nestedLoops = new NestedLoops();
        for (int x : NestedLoops.task332(consoleReader.inputNaturalNumber())) {
            System.out.println(x);
        }
    }

    static void runTask241() {
        LoopsAndBranch loopsAndBranch = new LoopsAndBranch();
        System.out.println(loopsAndBranch.task241(consoleReader.inputNaturalNumber(), consoleReader.inputDoubleNumber()));
    }

    private static void runTask555() {

        int num;

        num = consoleReader.inputNaturalNumber();

        System.out.println(Arrays.deepToString(IntegerNumbers.task555(num)));
    }

    private static void runTask178h() {
        System.out.println(LoopsAndBranch.task178h(consoleReader.inputArrayOfNaturalNumbers()));
    }

    static void runTask331a() {
        int[] result = NestedLoops.task331a(consoleReader.inputNaturalNumber());
        if (result.length == 0) {
            System.out.println("Result not found!");
        } else {
            System.out.println("x: " + result[0] + " y: " + result[1] + " z: " + result[2]);
        }
    }

    static void runTask182() {
        LoopsAndBranch loopsAndBranch = new LoopsAndBranch();
        System.out.println(LoopsAndBranch.task182(consoleReader.inputArrayOfNaturalNumbers()));
        System.out.println("Count" + " " + "Sum ");
    }

    static void runTask88g() {
        SimpleLoops simpleLoops = new SimpleLoops();
        System.out.println(SimpleLoops.task88g(consoleReader.inputNaturalNumber()));
    }

    static void runTask86a() {
        int num;
        num = consoleReader.inputNaturalNumber();
        System.out.println(SimpleLoops.task86a(num));
    }

    static void runTask86b() {

        int num;

        num = consoleReader.inputNaturalNumber();

        System.out.println(SimpleLoops.task86b(num));
    }

    static void runTask88() {
        System.out.println("Result: " + SimpleLoops.task88(consoleReader.inputNaturalNumber()));
    }

    static void runTask88c() {

        Integer n;
        n = consoleReader.inputNaturalNumber();
        System.out.println("result: " + SimpleLoops.task88c(n));


    }

    static void runTask87() {
        int n;
        int m;
        while (true) {
            n = consoleReader.inputNaturalNumber();
            m = consoleReader.inputNaturalNumber();
            if (Integer.toString(n).length() < m) {
                System.out.println("Second number is too big!");
            } else {
                break;
            }
        }
        System.out.println("result: " + SimpleLoops.task87(n, m));
    }

    static void runTask107() {
        int num;
        num = consoleReader.inputNaturalNumber();
        System.out.println(SimpleLoops.task107(num));
    }

    static void runTask108() {

        int num;

        num = consoleReader.inputNaturalNumber();

        System.out.println(SimpleLoops.task108(num));
    }

    static void runTask224() {
        System.out.println("This task show you all divisors for number: ");
        int num;
        num = consoleReader.inputNaturalNumber();
        System.out.println(LoopsAndBranch.task224(num));
    }

    static void runTask178b() {
        System.out.println("Result: " + LoopsAndBranch.task178b(consoleReader.inputArrayOfNaturalNumbers()));
    }

    static void runTask329() {
        List<Integer> result = NestedLoops.task329(consoleReader.inputNaturalNumber(), consoleReader.inputNaturalNumber());
        if (result.isEmpty()) {
            System.out.println("There are no such numbers!");
        } else {
            System.out.println("result: " + result);
        }

    }

    static void runTask88a() {
        System.out.println(SimpleLoops.task88a(consoleReader.inputNaturalNumber()));
    }

    static void runTask178c() {
        System.out.println(LoopsAndBranch.task178c(consoleReader.inputArrayOfNaturalNumbers()));
    }

    static void runTask227() {
        System.out.println(LoopsAndBranch.task227(consoleReader.inputIntegerNumber(), consoleReader.inputIntegerNumber()));
    }

    static void runTask330() {
        System.out.println(NestedLoops.task330(consoleReader.inputNaturalNumber()));
    }

    static void runTask560() {
        for (int[] arr : IntegerNumbers.task560()) {
            System.out.println(arr[0] + " " + arr[1]);
            ;
        }
    }

    static void runTask225() {

        int num;

        num = consoleReader.inputNaturalNumber();

        System.out.println(LoopsAndBranch.task225(num));
    }

    static void runTask226() {
        List<Integer> res = LoopsAndBranch.task226(consoleReader.inputNaturalNumber(), consoleReader.inputNaturalNumber());
        if (res.isEmpty()) {
            System.out.println("There are no such numbers, that you need!");
        } else {
            System.out.println("result: " + res);
        }

    }

    static void runTask554() {
        System.out.println("Put the limit number: ");
        List<ArrayList<Integer>> result = IntegerNumbers.task554(consoleReader.inputNaturalNumber());
        if (result.isEmpty()) {
            System.out.println("There are no such numbers");
        }
        System.out.println(result);
    }

    static void runTask559() {
        List<Integer> result = IntegerNumbers.task559(consoleReader.inputNaturalNumber());
        if (result.isEmpty()) {
            System.out.println("There are no such numbers,less then n!");
        }
        System.out.println("result: " + result);
    }

    static void runTask243a() {
        int[] result = LoopsAndBranch.task243a(consoleReader.inputNaturalNumber());
        if (result.length == 0) {
            System.out.println("Result not found!");
        } else {
            System.out.println("x: " + result[0] + " y: " + result[1]);
        }
    }

    static void runTask561() {
        ArrayList<Integer> result = IntegerNumbers.task561(consoleReader.inputNaturalNumber());
        if (result.isEmpty()) {
            System.out.println("Result nit found!");
        } else {
            for (int a : result) {
                System.out.println("Result: " + a);
            }
        }
    }

    static void runTask178d() {

        Integer n;
        int[] array;
        while (true) {
            n = consoleReader.inputNaturalNumber();
            array = consoleReader.inputArrayOfNaturalNumbers();

            if (array.length > n) {
                System.out.println("Length of array is to big!");
            } else {
                break;
            }
        }
        System.out.println("result: " + LoopsAndBranch.task178d(array, n));
    }


    static void runTask243b() {
        Integer n = consoleReader.inputNaturalNumber();
        System.out.println("result: " + LoopsAndBranch.task243b(n));

    }

    static void runTask323() {
        System.out.println("Get all coprime integers for number:");
        int num;
        num = consoleReader.inputNaturalNumber();
        System.out.println(NestedLoops.task323(num));
    }

    static void runTask325() {

        int num;

        num = consoleReader.inputNaturalNumber();

        System.out.println(NestedLoops.task325(num));
    }

    static void runTask331b() {
        Integer n = consoleReader.inputNaturalNumber();
        System.out.println("result: " + NestedLoops.task331b(n));
    }

    static void runTask562() {

        System.out.println("result: ");
        System.out.println(IntegerNumbers.task562());


    }

    static void runTask86h() {
        int i = consoleReader.inputNaturalNumber();
        System.out.printf("For n = %d%nRezult = %d%n", i, SimpleLoops.task86h(i));
    }

    static void runTask184() {
        int p, q;
        Random random = new Random(100);
        int[] list = new int[67];
        for (int i = 0; i < 67; i++)
            list[i] = random.nextInt(400);

        System.out.println("For this task you need input two numbers (p,q)\n"
                + "But variable <p> must be bigger than <q>!");
        while (true) {
            p = consoleReader.inputNaturalNumber();
            q = consoleReader.inputNaturalNumber();
            if (p > q) {
                break;
            } else {
                System.out.println("Please try again, because <p> must be bigger than <q>!!!");
            }
        }
        System.out.printf("If:%np = %d%nq = %d%nRezult: %s%n", p, q, Arrays.toString(SimpleLoops.task184(p, q, list)));

    }

    static void runTask242() {
        int n = consoleReader.inputNaturalNumber();
        System.out.printf("For n = %d%nRezult: %s%n", n, LoopsAndBranch.task242(n));
    }

    static void runTask340() {
        Random random = new Random();
        int[] list = new int[20];
        for (int i = 0; i < 20; i++)
            list[i] = random.nextInt(100);
        int n = consoleReader.inputNaturalNumber();
        System.out.printf("Our array: %s%nFor n = %d%nRezult: %s%n", Arrays.toString(list), n, NestedLoops.task340(n, list));

    }

    static void runTask569() {
        int n = consoleReader.inputNaturalNumber();
        System.out.printf("If n = %s%nRezult: %s%n", n, IntegerNumbers.task569(n));
    }
}
