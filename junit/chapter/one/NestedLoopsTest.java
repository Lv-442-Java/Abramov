package chapter.one;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NestedLoopsTest {

    @Test
    void task329_testWithDefaultInput() {
        int firstNum = 31;
        int secondNum = 9;

        List<Integer> actual = NestedLoops.task329(firstNum, secondNum);

        List<Integer> expected = new ArrayList<Integer>() {
            {
                add(3); add(12); add(21); add(30);
            }
        };

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task329_testThatResultNumsMustBeLessThanFirstNum() {
        int firstNum = 30;
        int secondNum = 9;

        List<Integer> actual = NestedLoops.task329(firstNum, secondNum);

        List<Integer> expected = new ArrayList<Integer>() {
            {
                add(3); add(12); add(21);
            }
        };

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task329_testWhenSecondNumHasNoIntegerSqrt() {
        int firstNum = 300;
        int secondNum = 10;

        List<Integer> actual = NestedLoops.task329(firstNum, secondNum);

        List<Integer> expected = new ArrayList<Integer>();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task329_testForEmptyResult() {
        int firstNum = 7;
        int secondNum = 49;

        List<Integer> actual = NestedLoops.task329(firstNum, secondNum);

        List<Integer> expected = new ArrayList<Integer>();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void task332() {
    }

    @Test
    void task330() {
    }

    @Test
    void task331a() {
    }

    @Test
    void task323() {
    }

    @Test
    void task325() {
    }

    @Test
    void task331b() {
    }

    @Test
    void task340() {
    }
}